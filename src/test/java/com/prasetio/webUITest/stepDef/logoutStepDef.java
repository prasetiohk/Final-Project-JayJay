package com.prasetio.webUITest.stepDef;

import Test.baseTest;
import com.prasetio.webUITest.page.firstPage;
import com.prasetio.webUITest.page.homePage;
import com.prasetio.webUITest.page.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutStepDef extends baseTest {
    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;
        @Given("user is on home page")
    public void userIsOnHomePage(){
            LoginPage = new loginPage(driver);
            HomePage = new homePage(driver);
            FirstPage = new firstPage(driver);
            FirstPage.goToFirstPage();
            FirstPage.click_login_button();
            LoginPage.validateOnLoginPage();
            LoginPage.inputUsername("harianto1");
            LoginPage.inputPassword("t3st1ng");
            LoginPage.clickLoginButton();
            HomePage.validateOnHomePage();
            
        }

    @When("user click logout button")
    public void userClickLogoutButton() {
            HomePage = new homePage(driver);
            HomePage.clickLinkLogOut();
        
    }

    @Then("user on at first page")
    public void userOnAtFirstPage() {
            FirstPage = new firstPage(driver);
            FirstPage.validateOnFirstPage();
    }
}
