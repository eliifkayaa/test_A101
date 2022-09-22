package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class homePage {
    WebDriver driver;
    WebDriverWait wait;
    By logo = By.cssSelector("a[class='logo'] img[loading='lazy']");
    By cookie = By.cssSelector("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    //By close = By.cssSelector("div[class='closePopupPersona'] div");


    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }
    public void setDefaultSettings(int time) {
        //driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void checkLogo() {
        driver.findElement(logo);
        driver.findElement(cookie).click();
        //driver.findElement(close).click();
    }

}
