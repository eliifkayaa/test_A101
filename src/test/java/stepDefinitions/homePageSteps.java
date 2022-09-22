package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.homePage;
import util.driverFactory;

public class homePageSteps {
        WebDriver driver = new driverFactory().getDriver();
        homePage homePage = new homePage(driver);
        @Given("Application is opened")
        public void application_is_opened() {
                homePage.setDefaultSettings(10);
        }
        @Then("Should see Banner")
        public void should_see_banner() {
                homePage.checkLogo();
        }
    }
