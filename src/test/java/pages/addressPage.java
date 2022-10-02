package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.time.Duration;

public class addressPage {
    WebDriver driver;
    WebDriverWait wait;
    elementHelper elementHelper;

    By title = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(3) > div > div > label > input[type=text]");
    By name = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(4) > div:nth-child(1) > div > label > input[type=text]");
    By surname = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(4) > div:nth-child(2) > div > label > input[type=text]");
    By phone = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(5) > div > div > label > input");
    By city = By.name("city");
    By country = By.name("township");
    By quarter =  By.name("district");
    By info = By.cssSelector("textarea[name='line']");
    By addSave = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > button.button.green.js-set-country.js-prevent-emoji");
    //By screen = By.cssSelector("body > section:nth-child(2) > section:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1)");

    public addressPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new elementHelper(driver);
    }

    public void title() {
        driver.findElement(title).sendKeys("Ev adresim");
    }

    public void name() {
        driver.findElement(name).sendKeys("Elif");
    }

    public void surname() {
        driver.findElement(surname).sendKeys("Gökçe");
    }

    public void phone() {
        driver.findElement(phone).sendKeys("5315096769");
    }

    public void city() {
      /*  Select drpCity = new Select (driver.findElement(country));
        drpCity.selectByVisibleText("İSTANBUL");
       */
        driver.findElement(city).sendKeys("DENİZLİ");
    }

    public void country() {
        driver.findElement(country).sendKeys("MERKEZEFENDİ");
    }

    public void quarter() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(quarter));
        driver.findElement(quarter).sendKeys("MEHMET AKİF MAH");

    }

    public void information() {
        driver.findElement(info).sendKeys("Hürevler Sitesi");
    }

    public void addressSave() {
        WebElement element = driver.findElement(addSave);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

}
