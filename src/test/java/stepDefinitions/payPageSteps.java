package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.cardPage;
import pages.payPage;
import util.driverFactory;

public class payPageSteps {
    WebDriver driver = new driverFactory().getDriver();
    payPage payPage = new payPage(driver);

    @When("Enter mail")
    public void enter_mail() {
        payPage.mail();
    }
    @When("Go On")
    public void goOn() {
        payPage.goOn();
    }

    @When("Create address")
    public void create_address() {
        payPage.address();

    }


}
