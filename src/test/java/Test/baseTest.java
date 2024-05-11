package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseTest {

    protected static WebDriver driver;
    protected void getDriver(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*","--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);

    }
}
