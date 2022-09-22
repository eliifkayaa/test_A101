package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productPage {

    WebDriver driver;
    WebDriverWait wait;
    //By category = By.cssSelector("a[title='Dizaltı Çorap']");
    //By close = By.cssSelector("body > div.personaPopup > div.closePopupPersona");
    By searchBox = By.cssSelector("input[placeholder='Ürün, kategori veya marka arayın...']");
    By search = By.cssSelector("button[type='submit'] em[class='input-icon icon-search']");
    By black = By.cssSelector("body > section > section.page-list.js-container > div:nth-child(3) > div.content > div > div.col-md-2.col-sm-3 > div.list-filters.js-list-filters > div.filters > ul:nth-child(9) > li:nth-child(1) > label");
    By product = By.cssSelector("body > section:nth-child(2) > section:nth-child(6) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > article:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2)");
    By seeBlack = By.cssSelector("div[class='selected-variant-text'] span");
    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    public void getCategory(String product) {
        driver.findElement(searchBox).sendKeys(product);
        //driver.findElement(category).click();
    }

    public void clickButton() {
        driver.findElement(search).click();
    }
    public void filter() {
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("window.scrollBy(0 , 2000);");
        driver.findElement(black).click();
    }

    public void selectProduct() {
        driver.findElement(product).click();
    }

    public void seeBlack() {
        driver.findElement(seeBlack);
    }
}
