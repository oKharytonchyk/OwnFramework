package levelUpTask.automation.api.steps.business.common;

import org.springframework.stereotype.Component;

import static levelUpTask.automation.core.context.ScenarioContext.environmentContext;

@Component
public class ApiResponseSteps {

    public int getResponseStatusCode() {
        return environmentContext.getResponse().getStatusCode();
    }

}
