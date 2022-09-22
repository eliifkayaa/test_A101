package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.cardPage;
import util.driverFactory;

public class cardPageSteps {
    WebDriver driver = new driverFactory().getDriver();
    cardPage cardPage = new cardPage(driver);
    @When("Click add to cart")
    public void click_add_to_cart() {
        cardPage.addCard();
    }
    @When("Click view cart")
    public void click_view_cart() {
        cardPage.viewCard();
    }
    @When("Click confirm cart")
    public void click_confirm_cart() {
        cardPage.confirmCard();
    }
    @When("Click without registration")
    public void click_without_registration() {
        cardPage.registration();
    }
}
