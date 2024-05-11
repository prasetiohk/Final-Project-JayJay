package com.prasetio.webUITest.page;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
    WebDriver driver;
    By linkLogout = By.id("logout2");
    By linkHome = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By linkContact = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By linkAboutUs = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
    By linkCart = By.id("cartur");
    By linkTextPhones = By.linkText("Phones");
    By linkTextLaptops = By.linkText("Laptops");
    By linkTextMonitors = By.linkText("Monitors");
    By linkTextSamsungGalaxyS6 = By.linkText("Samsung galaxy s6");
    By linkTextNokiaLumia1520 = By.linkText("Nokia lumia 1520");
    By linkTextNexus6 = By.linkText("Nexus 6");
    By linkTextSamsungGalaxyS7 = By.linkText("Samsung galaxy s7");
    By linkTextIphone6_32gb = By.linkText("Iphone 6 32gb");
    By linkTextSonyXperiaZ5 = By.linkText("Sony xperia z5");
    By linkTextHTCOneM9 = By.linkText("HTC One M9");
    By linkTextSonyVaioI5 = By.linkText("Sony vaio i5");
    By linkTextSonyVaioI7 = By.linkText("Sony vaio i7");
    By linkTextAppleMonitor24 = By.linkText("Apple monitor 24");
    By linkTextMacBookAir = By.linkText("MacBook air");
    By linkTextDellI78gb = By.linkText("Dell i7 8gb");
    By linkText2017Dell156Inch = By.linkText("2017 Dell 15.6 Inch");
    By linkTextASUSFullHD = By.linkText("ASUS Full HD");
    By linkTextMacBookPro = By.linkText("MacBook Pro");
    By categoryProduct = By.id("cat");
    By addToCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public homePage (WebDriver driver){
        this.driver=driver;
    }
    public void validateOnHomePage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkLogout));
        String welcomeUser = driver.findElement(By.id("nameofuser")).getText();
        String textWelcome = welcomeUser.substring(0, 7);

        assertEquals("Welcome", textWelcome);
    }
    public void clickLinkLogOut() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkLogout));

        driver.findElement(linkLogout).click();
    }

    public void clickLinkContact() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkContact));

        driver.findElement(linkContact).click();
    }

    public void clickLinkAboutUs() {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkAboutUs));

        driver.findElement(linkAboutUs).click();
    }

    public void clickLinkTextPhones() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));


        driver.findElement(linkTextPhones).click();
    }

    public void clickLinkTextLaptops() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));

        driver.findElement(linkTextLaptops).click();
    }

    public void clickLinTextMonitors() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMonitors));

        driver.findElement(linkTextMonitors).click();
    }

    public void clickLinkTextSamsungGalaxyS6() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGalaxyS6));

        driver.findElement(linkTextSamsungGalaxyS6).click();
    }

    public void clickLinkTextNokiaLumia1520() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextNokiaLumia1520));

        driver.findElement(linkTextNokiaLumia1520).click();
    }

    public void clickLinkTextNexus6() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextNexus6));

        driver.findElement(linkTextNexus6).click();
    }

    public void clickLinkTextSamsungGalaxyS7() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGalaxyS7));

        driver.findElement(linkTextSamsungGalaxyS7).click();
    }

    public void clickLinkTextIphone6_32gb() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextIphone6_32gb));

        driver.findElement(linkTextIphone6_32gb).click();
    }

    public void clickLinkTextSonyXperiaZ5() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyXperiaZ5));

        driver.findElement(linkTextSonyXperiaZ5).click();
    }

    public void clickLinkTextHTCOneM9() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextHTCOneM9));

        driver.findElement(linkTextHTCOneM9).click();
    }

    public void clickLinkTextAppleMonitor24() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextAppleMonitor24));

        driver.findElement(linkTextAppleMonitor24).click();
    }

    public void clickLinkTextASUSFullHD() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextASUSFullHD));

        driver.findElement(linkTextASUSFullHD).click();

    }

    public void clickLinkTextSonyVaioI5() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyVaioI5));

        driver.findElement(linkTextSonyVaioI5).click();
    }


    public void clickLinkTextSonyVaioI7() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyVaioI7));

        driver.findElement(linkTextSonyVaioI7).click();
    }

    public void clickLinkTextMacBookAir() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMacBookAir));

        driver.findElement(linkTextMacBookAir).click();
    }

    public void clickLinkTextDellI78gb() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextDellI78gb));

        driver.findElement(linkTextDellI78gb).click();
    }

    public void clickLinkText2017Dell156Inch() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkText2017Dell156Inch));

        driver.findElement(linkText2017Dell156Inch).click();
    }

    public void clickLinkTextMacBookPro() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5
        ));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMacBookPro));

        driver.findElement(linkTextMacBookPro).click();
    }

    public void clickAddToCartButton() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(addToCart));

        driver.findElement(addToCart).click();
    }

    public void clickLinkTextCart() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkCart));

        driver.findElement(linkCart).click();
    }
    public void validateListCategoryPhones() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(linkTextSamsungGalaxyS6));

        String productName = driver.findElement(linkTextSamsungGalaxyS6).getText();
        assertEquals("Samsung galaxy s6", productName);

    }

    public void validateListCategoryLaptops() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(linkTextSonyVaioI7));

        String productLaptop = driver.findElement(linkTextSonyVaioI7).getText();
        assertEquals("Sony vaio i7", productLaptop);

    }

    public void validateListCategoryMonitors() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(linkTextASUSFullHD));

        String productName = driver.findElement(linkTextASUSFullHD).getText();
        assertEquals("ASUS Full HD", productName);

    }

    public void clickLinkTextHome() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkHome));

        driver.findElement(linkHome).click();

    }

    public void addProductPhonesToCart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGalaxyS6));
        driver.findElement(linkTextSamsungGalaxyS6).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextNokiaLumia1520));
        driver.findElement(linkTextNokiaLumia1520).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextNexus6));
        driver.findElement(linkTextNexus6).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGalaxyS7));
        driver.findElement(linkTextSamsungGalaxyS7).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextIphone6_32gb));
        driver.findElement(linkTextIphone6_32gb).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyXperiaZ5));
        driver.findElement(linkTextSonyXperiaZ5).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHTCOneM9));
        driver.findElement(linkTextHTCOneM9).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

    }


    public void addProductLaptops() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyVaioI5));
        driver.findElement(linkTextSonyVaioI5).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyVaioI7));
        driver.findElement(linkTextSonyVaioI7).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextMacBookAir));
        driver.findElement(linkTextMacBookAir).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextDellI78gb));
        driver.findElement(linkTextDellI78gb).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkText2017Dell156Inch));
        driver.findElement(linkText2017Dell156Inch).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextMacBookPro));
        driver.findElement(linkTextMacBookPro).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

    }

    public void addProductMonitors()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(linkTextMonitors));
        driver.findElement(linkTextMonitors).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextAppleMonitor24));
        driver.findElement(linkTextAppleMonitor24).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextMonitors));
        driver.findElement(linkTextMonitors).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextASUSFullHD));
        driver.findElement(linkTextASUSFullHD).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkHome));
        driver.findElement(linkHome).click();

    }


}
