package com.prasetio.webUITest.stepDef;

import Test.baseTest;
import com.prasetio.webUITest.page.contactPage;
import com.prasetio.webUITest.page.firstPage;
import com.prasetio.webUITest.page.homePage;
import com.prasetio.webUITest.page.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contactStepDef extends baseTest {
        firstPage FirstPage;
        loginPage LoginPage;
        homePage HomePage;
        contactPage ContactPage;
    @Given("user on contact page")
    public void userOnContactPage(){
        LoginPage = new loginPage(driver);
        FirstPage = new firstPage(driver);
        HomePage = new homePage(driver);
        ContactPage = new contactPage(driver);

        FirstPage.goToFirstPage();
        FirstPage.click_login_button();
        LoginPage.validateOnLoginPage();
        LoginPage.inputUsername("harianto1");
        LoginPage.inputPassword("t3st1ng");
        LoginPage.clickLoginButton();
        HomePage.validateOnHomePage();
        HomePage.clickLinkContact();
        ContactPage.validateOnContactPage();
    }

    @And("input email address {string}")
    public void inputEmailAddress(String email) {
        ContactPage = new contactPage(driver);
        ContactPage.inputEmailAddress(email);
    }

    @And("input name {string}")
    public void inputName(String name) {
        ContactPage = new contactPage(driver);
        ContactPage.inputEmailAddress(name);
    }

    @And("input message text {string}")
    public void inputMessageText(String message) {
        ContactPage = new contactPage(driver);
        ContactPage.inputEmailAddress(message);
    }

    @When("user click send message button")
    public void userClickSendMessageButton() {
        ContactPage = new contactPage(driver);
        ContactPage.clickSendMessageButton();
    }

    @Then("user get message box {string}")
    public void userGetMessageBox(String messageBox) {
        ContactPage = new contactPage(driver);
        ContactPage.validateMessageBox(messageBox);
    }

    @When("user click close button contact")
    public void userClickCloseButtonContact() {
        ContactPage = new contactPage(driver);
        ContactPage.clickCloseButton();
    }

    @Then("user is redirect homePage")
    public void userIsRedirectHomePage() {
        HomePage = new homePage(driver);

        HomePage.validateOnHomePage();
    }
}
