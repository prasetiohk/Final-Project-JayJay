package com.ryan.webUITest.stepDef;

import Test.baseTest;
import com.prasetio.webUITest.page.aboutUsPage;
import com.prasetio.webUITest.page.firstPage;
import com.prasetio.webUITest.page.homePage;
import com.prasetio.webUITest.page.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutUsStepDef extends baseTest {
    firstPage  FirstPage;
    loginPage  LoginPage;
    homePage  HomePage;
    aboutUsPage AboutUsPage;


    @Given("user is on About Us Page")
    public void userIsOnAboutUsPage() {
        LoginPage = new loginPage(driver);
        FirstPage = new firstPage(driver);
        HomePage = new homePage(driver);
        AboutUsPage = new aboutUsPage(driver);

        FirstPage.goToFirstPage();
        FirstPage.click_login_button();
        LoginPage.validateOnLoginPage();
        LoginPage.inputUsername("harianto1");
        LoginPage.inputPassword("t3st1ng");
        LoginPage.clickLoginButton();
        HomePage.validateOnHomePage();
        HomePage.clickLinkAboutUs();
    }

    @When("user click Play Button")
    public void userClickPlayButton() {
        AboutUsPage = new aboutUsPage(driver);
        AboutUsPage.clickPlayButtonVideo();
    }

    @Then("about Us Video Displayed")
    public void aboutUsVideoDisplayed() {
        AboutUsPage = new aboutUsPage(driver);
        AboutUsPage.clickCloseButtonAbout();
    }

    @When("user click closed button video")
    public void userClickClosedButtonVideo() {

        AboutUsPage = new aboutUsPage(driver);
        AboutUsPage.clickCloseButtonAbout();
    }

    @Then("user is on HomePage")
    public void userIsOnHomePage() {
        HomePage = new homePage(driver);
        HomePage.validateOnHomePage();
    }
}
