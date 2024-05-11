package com.prasetio.webUITest.page;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage {
    WebDriver driver;
    By linkHome = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By placeOrderButton = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By listProduct = By.id("tbodyid");
    By DeleteCart = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a");

    public cartPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickPlaceOrderButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));

        driver.findElement(placeOrderButton).click();
    }
    public void validateCartList(String product_name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(listProduct));

        String listProductCart = driver.findElement(listProduct).getText();
        assertTrue(driver.findElement(listProduct).isDisplayed());
    }

    public void validateCartListEmpty(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(listProduct));
        String Text = driver.findElement(listProduct).getText();
        assertEquals("",Text);
    }
    public void deleteAllCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        for (int i = 1; i <17; i++){
            String Text = driver.findElement(listProduct).getText();
            if(Text != ""){
                wait.until(ExpectedConditions.elementToBeClickable(DeleteCart));
                driver.findElement(DeleteCart);
            }else{
                String findText = driver.findElement(listProduct).getText();
                assertEquals("",findText);
            }
        }
    }
    public void clickLinkTextHome() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(linkHome));

        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("nameofuser")));

    }
    public void deletedCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(DeleteCart));
        driver.findElement(DeleteCart).click();

    }
    public void validateOnCartPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(placeOrderButton));
        assertTrue(driver.findElement(placeOrderButton).isEnabled());
    }
}
