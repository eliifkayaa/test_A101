
package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.orderPage;
import util.driverFactory;

public class orderPageSteps {
    WebDriver driver = new driverFactory().getDriver();
    orderPage orderPage = new orderPage(driver);

    @When("Choose cargo")

    public void choose_cargo() {
       // orderPage.cargo();
        }


    @When("Save and continue")
    public void save_and_continue() {
        // orderPage.save_continue();

    }

    @Then("Should see Pay")
    public void shouldSeePay() {
      //  orderPage.seePay();
    }
}
