package suites;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "//src//test//java//tests//login.feature",
        glue = "steps",
        strict = true,
        monochrome = true
)

public class TestRunner {
}
