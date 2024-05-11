package com.prasetio.webUITest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class contactPage {
    WebDriver driver;
    By emailInput = By.id("recipient-email");
    By nameInput = By.id("recipient-name");
    By messageInput = By.id("message-text");
    By sendButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
    By closeButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");
    By newMessageHeader = By.id("exampleModalLabel");

    public contactPage(WebDriver driver){
        this.driver = driver;
    }
    public void inputEmailAddress(String email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(emailInput));
        driver.findElement(emailInput).sendKeys(email);
    }
    public void inputName(String name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(nameInput));
        driver.findElement(nameInput).sendKeys(name);
    }
    public void inputMessage(String message){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(messageInput));
        driver.findElement(messageInput).sendKeys(message);
    }
    public void clickSendMessageButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        driver.findElement(sendButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        String alertMessage = driver.switchTo().alert().getText();
        assertEquals("Thanks for the message!!",alertMessage);
    }
    public void clickCloseButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        driver.findElement(closeButton).click();
    }
    public void validateOnContactPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        String headMessage= driver.findElement(newMessageHeader).getText();
        assertEquals("New message",headMessage);
    }
    public void validateMessageBox(String messageBox){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        String messageBoxPop = driver.switchTo().alert().getText();
        assertEquals(messageBox, messageBoxPop);
        driver.switchTo().alert().accept();
    }
}
