package levelUpTask.automation.api;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "levelUpTask.automation.api",
        features = "src/test/resources/features/api",
        monochrome = true
)
public class ApiTaskTestSuite {

}

