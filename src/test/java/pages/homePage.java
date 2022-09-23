package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.util.concurrent.TimeUnit;

public class homePage {
    WebDriver driver;
    WebDriverWait wait;
    elementHelper elementHelper;

    By logo = By.cssSelector("a[class='logo'] img[loading='lazy']");
    By cookie = By.cssSelector("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    //By close = By.cssSelector("div[class='closePopupPersona'] div");


    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new elementHelper(driver);
    }
    public void setDefaultSettings(int time) {
        //driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void checkLogo() {
        elementHelper.checkElementPresence(logo);
        elementHelper.click(cookie);
        //driver.findElement(close).click();
    }

}
