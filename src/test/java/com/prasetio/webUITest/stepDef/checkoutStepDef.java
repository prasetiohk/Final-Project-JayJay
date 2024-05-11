package com.prasetio.webUITest.stepDef;

import Test.baseTest;
import com.prasetio.webUITest.page.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class checkoutStepDef extends baseTest {
        firstPage FirstPage;
        loginPage LoginPage;
        homePage HomePage;
        cartPage CartPage;
        orderPage OrderPage;
        @Given("user is on orderPage")
    public void userIsOnOrderPage(){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            LoginPage = new loginPage(driver);
            FirstPage = new firstPage(driver);
            HomePage = new homePage(driver);
            CartPage = new cartPage(driver);
            OrderPage = new orderPage(driver);

            FirstPage.goToFirstPage();
            FirstPage.click_login_button();
            LoginPage.validateOnLoginPage();
            LoginPage.inputUsername("harianto2");
            LoginPage.inputPassword("t3st1ng");
            LoginPage.clickLoginButton();
            HomePage.validateOnHomePage();
            HomePage.clickLinkTextPhones();
            HomePage.clickLinkTextSonyXperiaZ5();
            HomePage.clickAddToCartButton();
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
            HomePage.clickLinkTextCart();
            CartPage.clickPlaceOrderButton();
        }

    @And("user input name with {string}")
    public void userInputNameWith(String name) {
            OrderPage = new orderPage(driver);
            OrderPage.inputName(name);
    }

    @And("user input country with {string}")
    public void userInputCountryWith(String country) {
        OrderPage = new orderPage(driver);
        OrderPage.inputCountry(country);
    }

    @And("user input city with {string}")
    public void userInputCityWith(String city) {
        OrderPage = new orderPage(driver);
        OrderPage.inputCity(city);
    }

    @And("user input credit card with {string}")
    public void userInputCreditCardWith(String creditCard) {
        OrderPage = new orderPage(driver);
        OrderPage.inputCreditCard(creditCard);
    }

    @And("user input month with {string}")
    public void userInputMonthWith(String month) {
        OrderPage = new orderPage(driver);
        OrderPage.inputMonth(month);
    }

    @And("user input year with {string}")
    public void userInputYearWith(String year) {
        OrderPage = new orderPage(driver);
        OrderPage.inputYear(year);
    }

    @When("user click purchase button")
    public void userClickPurchaseButton() {
        OrderPage = new orderPage(driver);
        OrderPage.clickPurchaseButton();
    }

    @Then("product already process purchase")
    public void productAlreadyProcessPurchase() {
        OrderPage = new orderPage(driver);
        HomePage = new homePage(driver);
        OrderPage.validateShopping();
        HomePage.validateOnHomePage();
    }

    @When("user click close button")
    public void userClickCloseButton() {
        OrderPage = new orderPage(driver);
        OrderPage.clickCloseButton();
    }

    @Then("user is on cartPage")
    public void userIsOnCartPage() {
        CartPage = new cartPage(driver);
        CartPage.validateOnCartPage();
    }

    @Then("user get message alert {string}")
    public void userGetMessageAlert(String alertMessage) {
            OrderPage = new orderPage(driver);
            OrderPage.validateAlertMessage(alertMessage);
    }
}
