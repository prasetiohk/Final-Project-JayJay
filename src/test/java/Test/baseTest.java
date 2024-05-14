package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseTest {

    protected static WebDriver driver;
    protected void getDriver(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--no-sandbox");
        option.addArguments("--disable-dev-shm-usage");
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--window-size=1920,1080");
        option.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);

    }
}
