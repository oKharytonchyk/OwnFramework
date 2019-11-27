package levelUpTask.automation.api.steps.business.common;

import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiResponseDefinitionSteps {

    @Autowired
    private ApiResponseSteps steps;

    @Then("^response status code is (\\d{3})$")
    public void verifyResponseStatusCode(int expectedStatusCode) {
        assertThat(steps.getResponseStatusCode()).isEqualTo(expectedStatusCode);
    }

}
