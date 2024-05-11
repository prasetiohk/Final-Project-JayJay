package com.prasetio.webUITest.stepDef;

import Test.baseTest;
import com.prasetio.webUITest.page.firstPage;
import com.prasetio.webUITest.page.homePage;
import com.prasetio.webUITest.page.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef extends baseTest {
    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;
        @Given("user is on login page")
    public void userIsOnLoginPage(){
           LoginPage = new loginPage(driver);
           FirstPage = new firstPage(driver);
           FirstPage.goToFirstPage();
           FirstPage.click_login_button();
           LoginPage.validateOnLoginPage();


        }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        LoginPage = new loginPage(driver);
        LoginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        LoginPage = new loginPage(driver);
        LoginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        LoginPage = new loginPage(driver);
        LoginPage.clickLoginButton();
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
            HomePage = new homePage(driver);
            HomePage.validateOnHomePage();
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String errorMessage) {
            LoginPage = new loginPage(driver);
            LoginPage.validateError(errorMessage);
    }

    @When("user click on close button")
    public void userClickOnCloseButton() {
            LoginPage = new loginPage(driver);
            LoginPage.clickCloseButton();
    }

    @Then("user is on first page")
    public void userIsOnFirstPage() {
            FirstPage = new firstPage(driver);
            FirstPage.validateOnFirstPage();
    }

}
