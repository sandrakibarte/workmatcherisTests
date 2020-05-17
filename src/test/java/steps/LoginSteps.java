package steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("^launch chrome browser$")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Donatas\\IdeaProjects\\workmatcheris\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("^open google page$")
    public void open_google_page() {
        driver.get("https://www.google.lt/");

    }

    @Then("^verify that logo is$")
    public void verify_that_logo_is() {
        boolean status = driver.findElement(By.id("hplogo")).isDisplayed();
        Assert.assertEquals(true, status);

    }

    @Then("^close browser$")
    public void close_browser() {
        driver.quit();
    }

}
