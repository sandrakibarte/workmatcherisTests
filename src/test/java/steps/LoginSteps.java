package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverInit;

import java.sql.Driver;

public class LoginSteps extends DriverInit {

    @Before
    public void setUp() {
        super.setUp();
    }

    @After
    public void closeBrowser() {
        super.closeBrowser();
    }

    @Given("^open google page$")
    public void open_google_page() {
        driver.get("https://www.google.lt/");
    }

    @When("^verify that logo is$")
    public void verify_that_logo_is() {
        boolean status = driver.findElement(By.id("hplogo")).isDisplayed();
        Assert.assertEquals(true, status);

    }


}
