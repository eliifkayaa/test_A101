package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.productPage;
import util.driverFactory;

public class productPageSteps {

    WebDriver driver = new driverFactory().getDriver();
    productPage productPage = new productPage(driver);

  /*  @When("Select category")
    public void select_category() {
        productPage.getCategory();
    }
    */

    @When("Select category {string}")
    public void select_category(String product) {
        productPage.getCategory(product);
    }
    @When("Click search button")
    public void click_search_button() {
        productPage.clickButton();
    }

    @When("Filter Black color")
    public void filter_black_color() {
        productPage.filter();

    }
    @When("Select Product")
    public void select_product() {
        productPage.selectProduct();
    }
    @Then("Should see Black Product")
    public void should_see_black_product() {
        productPage.seeBlack();

    }
}
