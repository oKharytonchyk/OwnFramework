package levelUpTask.automation.storefront;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "levelUpTask.automation.storefront",
        features = "src/test/resources/features/storefront",
        monochrome = true
)
public class TaskTestSuite {

}
