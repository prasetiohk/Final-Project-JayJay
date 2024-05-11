package com.prasetio.webUITest.stepDef;

import java.util.Objects;

import com.prasetio.webUITest.page.firstPage;
import com.prasetio.webUITest.page.homePage;
import com.prasetio.webUITest.page.loginPage;

import Test.baseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class categoriesProductStepDef extends baseTest {
    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;

        @Given("user is on homePage")
    public void userIsOnHomePage(){
            LoginPage = new loginPage(driver);
            FirstPage = new firstPage(driver);
            HomePage = new homePage(driver);

            FirstPage.goToFirstPage();
            FirstPage.click_login_button();
            LoginPage.validateOnLoginPage();
            LoginPage.inputUsername("harianto1");
            LoginPage.inputPassword("t3st1ng");
            LoginPage.clickLoginButton();
            HomePage.validateOnHomePage();
        }

    @When("user click text-link phones categories")
    public void userClickTextLinkPhonesCategories() {
            HomePage = new homePage(driver);
            HomePage.clickLinkTextPhones();
    }

    @Then("user see display product by phones categories")
    public void userSeeDisplayProductByPhonesCategories() {
            HomePage = new homePage(driver);
            HomePage.validateListCategoryPhones();
    }

    @When("user click text-link laptops categories")
    public void userClickTextLinkLaptopsCategories() {
            HomePage = new homePage(driver);
            HomePage.clickLinkTextLaptops();
    }

    @Then("user see display product by laptops categories")
    public void userSeeDisplayProductByLaptopsCategories() {
            HomePage = new homePage(driver);
            HomePage.validateListCategoryLaptops();
    }

    @When("user click text-link monitors categories")
    public void userClickTextLinkMonitorsCategories() {
            HomePage = new homePage(driver);
            HomePage.clickLinTextMonitors();
    }

    @Then("user see display product by monitors categories")
    public void userSeeDisplayProductByMonitorsCategories() {
            HomePage = new homePage(driver);
            HomePage.validateListCategoryMonitors();
    }

    @When("user click text-link categories {string}")
    public void userClickTextLinkCategoriesProductCategory(String category) {
            if (Objects.equals(category, "Phones")){
                HomePage = new homePage(driver);
                HomePage.clickLinkTextPhones();
            }else if (Objects.equals(category, "Laptops")){
                HomePage = new homePage(driver);
                HomePage.clickLinkTextLaptops();
            }else{
                HomePage = new homePage(driver);
                HomePage.clickLinTextMonitors();
        }

    }

    @Then("user see display product by {string} categories")
    public void userSeeDisplayProductByCategoryNameCategories(String categoryName) {
        if (Objects.equals(categoryName, "Phones")){
            HomePage = new homePage(driver);
            HomePage.validateListCategoryPhones();
        }else if (Objects.equals(categoryName, "Laptops")){
            HomePage = new homePage(driver);
            HomePage.validateListCategoryLaptops();
        }else{
            HomePage = new homePage(driver);
            HomePage.validateListCategoryMonitors();
        }
        }


}
