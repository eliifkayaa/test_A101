package util;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class hooks {
    WebDriver driver;  //= DriverFactory.getDriver();
    Properties properties;
    @Before
    public void before(){

        driver = driverFactory.initializeDriver("Chrome");
        properties = configReader.initialize_Properties();
    }
    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
        driver.quit();
    }
}

