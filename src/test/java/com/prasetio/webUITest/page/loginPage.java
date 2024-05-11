package com.prasetio.webUITest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class loginPage {
    WebDriver driver;
    By usernameInput = By.id("loginusername");
    By passwordInput = By.id("loginpassword");
    By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By closeButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");
    By loginPageHeader = By.id("logInModalLabel");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void inputUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(username);
    }

    public void inputPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginpassword")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
    }

    public void clickCloseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        driver.findElement(closeButton).click();
    }
    public void validateOnLoginPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginPageHeader));
        assertTrue(driver.findElement(passwordInput).isEnabled());
    }
    public void validateError(String errorMessage){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertLogin = driver.switchTo().alert().getText();
        assertEquals(errorMessage, alertLogin);
        driver.switchTo().alert().accept();
    }
}
