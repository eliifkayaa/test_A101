package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.addressPage;
import util.driverFactory;

public class addressPageSteps {
    WebDriver driver = new driverFactory().getDriver();
    addressPage addressPage = new addressPage(driver);

    @When("Address title")
    public void address_title() {
        addressPage.title();
    }
    @When("Address name")
    public void address_name() {
        addressPage.name();
    }
    @When("Address surname")
    public void address_surname() {
        addressPage.surname();
    }
    @When("Address phone")
    public void address_phone() {
        addressPage.phone();
    }
    @When("Address city")
    public void address_city() {
        addressPage.city();
    }
    @When("Address country")
    public void address_country() {
        addressPage.country();
    }
    @When("Address quarter")
    public void address_quarter() {
        addressPage.quarter();
    }
    @When("Address information")
    public void address_information() {
        addressPage.information();
    }
    @When("Address save")
    public void address_save() {
        addressPage.addressSave();
    }
    @Then("Address screen")
    public void addressScreen() {
     //   addressPage.addressScreen();
    }



}
