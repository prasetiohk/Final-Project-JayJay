package com.prasetio.webUITest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class signupPage {
    WebDriver driver;
    By usernameInput = By.id("sign-username");
    By passwordInput = By.id("sign-password");
    By signUpButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By closeButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");
    By signupHeader = By.id("signInModalLabel");

    public signupPage(WebDriver driver){
        this.driver=driver;
    }
    public void inputUsername(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-username")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(username);
    }
    public void inputPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-password")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }
    public void clickSignUpButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));

        driver.findElement(signUpButton).click();

    }
    public void clickCloseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));

        driver.findElement(closeButton).click();
    }
    public void validateOnSignUpPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(signupHeader));

        assertTrue(driver.findElement(passwordInput).isEnabled());
    }
    public void validateAlert(String Message) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        String alertSignUp = driver.switchTo().alert().getText();
        assertEquals(Message, alertSignUp);
        driver.switchTo().alert().accept();
    }

}
