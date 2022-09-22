package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cardPage {
    WebDriver driver;
    WebDriverWait wait;

    By addCard = By.cssSelector(".add-to-basket.button.green.block.with-icon.js-add-basket");
    By viewCard = By.cssSelector("#js-modal-basket > div.right-side > a.go-to-shop");
    By confirmCard = By.cssSelector(".button.green.checkout-button.block.js-checkout-button");
    By registration = By.cssSelector("body > section > div.page-auth > div > div.row.js-block-user.login-row > div:nth-child(1) > div.auth__form__proceed__wrapper > a");

    public cardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }
    public void addCard() {
        driver.findElement(addCard).click();
    }

    public void viewCard() {
        driver.findElement(viewCard).click();
    }

    public void confirmCard() {
        driver.findElement(confirmCard).click();
    }

    public void registration() {
        driver.findElement(registration).click();
    }
}
