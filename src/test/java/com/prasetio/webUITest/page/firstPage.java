package com.prasetio.webUITest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class firstPage {
    WebDriver driver;

    By login_Button = By.id("login2");
    By signup_Button = By.id("signin2");

    public firstPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToFirstPage() {
        driver.get("https://www.demoblaze.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nava")));
    }

    public void validateOnFirstPage() {

        String text = driver.findElement(By.id("cat")).getText();

        assertEquals("CATEGORIES", text);
    }
    public void click_login_button(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(login_Button));
        driver.findElement(login_Button).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logInModalLabel")));

    }
    public void click_signup(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(signup_Button));
        driver.findElement(signup_Button).click();
    }

}