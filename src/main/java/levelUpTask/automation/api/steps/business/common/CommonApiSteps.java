package levelUpTask.automation.api.steps.business.common;

import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;

import static io.restassured.RestAssured.given;
import static levelUpTask.automation.core.context.ScenarioContext.environmentContext;

public class CommonApiSteps {

    @Value("${api.endpoint}")
    private String apiEndpoint;

    protected String getApiEndpoint() {
        return apiEndpoint;
    }

    public RequestSpecification getCommonRequestSpecification() {
        return given().queryParam("key", environmentContext.getAuth());
    }

}
