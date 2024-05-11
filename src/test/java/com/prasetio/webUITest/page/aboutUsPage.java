package com.prasetio.webUITest.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aboutUsPage {
    WebDriver driver;
    By headAboutUs = By.id("videoModalLabel");
    By playButton = By.xpath("//*[@id=\"example-video\"]/div[1]");
    By closeButtonAbout = By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button");

    public aboutUsPage (WebDriver driver){
        this.driver = driver;
    }
    public void clickPlayButtonVideo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(playButton));
        driver.findElement(playButton).click();
    }
    public void clickCloseButtonAbout(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(closeButtonAbout));
        driver.findElement(closeButtonAbout).click();
    }
    public void validateOnAboutUsPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(headAboutUs));
    }
}
