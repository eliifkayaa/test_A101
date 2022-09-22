package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class driverFactory {
    static WebDriver driver;

    public static WebDriver initializeDriver(String browser) {
        if(browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static WebDriver getDriver() {
        return driver;
    }
}

