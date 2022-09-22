package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class addressPage {
    WebDriver driver;
    WebDriverWait wait;

    By title = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(3) > div > div > label > input[type=text]");
    By name = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(4) > div:nth-child(1) > div > label > input[type=text]");
    By surname = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(4) > div:nth-child(2) > div > label > input[type=text]");
    By phone = By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(5) > div > div > label > input");
    By country = By.name("city");
    By city = By.name("township");
    By quarter =  By.name("district");
    By info = By.cssSelector("textarea[name='line']");
    By save = By.cssSelector(".button.green.js-set-country.js-prevent-emoji");

    public addressPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
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
        driver.findElement(phone).sendKeys("5367051923");
    }

    public void city() {
        Select drpCity = new Select (driver.findElement(country));
        drpCity.selectByVisibleText("İSTANBUL");
    }

    public void country() {
        Select drpCountry = new Select (driver.findElement(city));
        drpCountry.selectByVisibleText("AVCILAR");
    }

    public void quarter() {
        Select drpQuarter = new Select (driver.findElement(quarter));
        drpQuarter.selectByVisibleText("AMBARLI MAH");

    }

    public void information() {
        driver.findElement(info).sendKeys("Hürevler Sitesi");
    }

    public void save() {
        driver.findElement(save).click();
    }
}
