package com.prasetio.webUITest.stepDef;

import Test.baseTest;
import com.prasetio.webUITest.page.cartPage;
import com.prasetio.webUITest.page.firstPage;
import com.prasetio.webUITest.page.homePage;
import com.prasetio.webUITest.page.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class deleteCartProductStepDef extends baseTest {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    firstPage  FirstPage;
    loginPage  LoginPage;
    homePage  HomePage;
    cartPage CartPage;
    @Given("user click delete button")
    public void userClickDeleteButton(){
        HomePage = new homePage(driver);
        CartPage = new cartPage(driver);
        CartPage.deletedCart();
        HomePage.clickLinkTextHome();
        HomePage.clickLinkTextCart();
    }

    @Given("product {string} already added to cart list")
    public void productAlreadyAddedToCartList(String listProduct) {
        LoginPage = new loginPage(driver);
        FirstPage = new firstPage(driver);
        HomePage = new homePage(driver);
        CartPage = new cartPage(driver);


        FirstPage.goToFirstPage();
        FirstPage.click_login_button();
        LoginPage.validateOnLoginPage();
        LoginPage.inputUsername("harianto1");
        LoginPage.inputPassword("t3st1ng");
        LoginPage.clickLoginButton();
        HomePage.validateOnHomePage();
        switch (listProduct) {
            case "Sony xperia z5":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextSonyXperiaZ5();
                break;

            case "Iphone 6 32gb":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextIphone6_32gb();
                break;
            case "Nexus 6":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextNexus6();
                break;
        }
        HomePage.clickAddToCartButton();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        HomePage.clickLinkTextCart();
    }

    @Then("product delete from cart list")
    public void productDeleteFromCartList() {
        CartPage = new cartPage(driver);
        CartPage.validateCartListEmpty();
    }
}
