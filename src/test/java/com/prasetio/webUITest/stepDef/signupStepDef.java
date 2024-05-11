package com.prasetio.webUITest.stepDef;

import Test.baseTest;
import com.prasetio.webUITest.page.firstPage;
import com.prasetio.webUITest.page.signupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class signupStepDef extends baseTest {
    firstPage FirstPage;
    signupPage SignupPage;
        @Given("user is on signup page")
    public void userIsOnSignupPage(){
            FirstPage = new firstPage(driver);
            SignupPage = new signupPage(driver);
            FirstPage.goToFirstPage();
            FirstPage.click_signup();
            SignupPage.validateOnSignUpPage();
        }

    @And("user input username signup with {string}")
    public void userInputUsernameSignupWith(String username) {
            SignupPage = new signupPage(driver);
            SignupPage.inputUsername(username);
    }

    @And("user input password signup with {string}")
    public void userInputPasswordSignupWith(String password) {
            SignupPage = new signupPage(driver);
            SignupPage.inputPassword(password);
    }

    @When("user click sign up button")
    public void userClickSignUpButton() {
            SignupPage = new signupPage(driver);
            SignupPage.clickSignUpButton();
    }

    @When("user click cancel sign up button")
    public void userClickCancelSignUpButton() {
            SignupPage = new signupPage(driver);
            SignupPage.clickCloseButton();
    }
}
