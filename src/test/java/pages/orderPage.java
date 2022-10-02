
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orderPage {
    WebDriver driver;
    WebDriverWait wait;
    By cargo = By.cssSelector("body > section > section > div > div.checkout-addresses.js-tab-content.active > div > div.col-sm-9 > div > div.continue > form > div.cargo > div.cargo-list > ul > li > label > div.check > div");
    By save = By.cssSelector(".button.block.green.js-proceed-button");
    By seePay = By.cssSelector("body > section > section > div > div.checkout-payment.js-tab-content.active > div.row > div.col-sm-9 > div.payment-area.js-payment-tab-content.active > form.js-tab-content.js-checkout-form > div.card > div.section-hero");
    public orderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

     public void cargo() {
        driver.findElement(cargo).click();

    }

    public void save_continue() {
        driver.findElement(save).click();
    }

    public void seePay() {
        //driver.findElement(seePay);
    }

}
