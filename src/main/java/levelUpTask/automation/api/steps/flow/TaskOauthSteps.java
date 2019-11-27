package levelUpTask.automation.api.steps.flow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static levelUpTask.automation.core.context.ScenarioContext.environmentContext;

@Component
public class TaskOauthSteps {

    @Value("${api.key}")
    private String apiKey;

    public void setToken(String clientRole) {
        switch (clientRole) {
            case "ANONYMOUS":
                authorize();
                break;
            case "CUSTOMER":
                login();
                break;
            default:
                throw new IllegalStateException("Unexpected role : " + clientRole);
        }
    }

    private void authorize() {
        environmentContext.setAuth("");
    }

    private void login() {
        environmentContext.setAuth(apiKey);
    }

}
