package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class payPage {
    WebDriver driver;
    WebDriverWait wait;

    By mail = By.cssSelector("body > section > div.page-auth > div > div.row.js-block-email > div > div > form > div.field > input");
    By goOn = By.cssSelector("body > section > div.page-auth > div > div.row.js-block-email > div > div > form > button");
    By address = By.cssSelector("body > section > section > div > div.checkout-addresses.js-tab-content.active > div > div.col-sm-9 > div > div.addresses > div.list > ul:nth-child(3) > li > a");
    public payPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    public void mail() {
        driver.findElement(mail).sendKeys("elifkayagokce@outlook.com");
    }

    public void goOn() {
        driver.findElement(goOn).click();
    }

    public void address() {
        driver.findElement(address).click();
    }
}
