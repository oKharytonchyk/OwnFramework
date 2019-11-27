package levelUpTask.automation.api.steps.business;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import levelUpTask.automation.api.steps.flow.TaskOauthSteps;
import levelUpTask.automation.core.context.ScenarioContext;
import levelUpTask.automation.framework.spring.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = AppConfig.class)
public class ApiHooks {

    @Autowired
    private TaskOauthSteps authSteps;

    @Before(value = "@role=anonymous", order = 1)
    public void requestAnonymousToken() {
        authSteps.setToken("ANONYMOUS");
    }

    @Before(value = "@role=customer", order = 1)
    public void requestCustomerToken() {
        authSteps.setToken("CUSTOMER");
    }

    @After(order = 1)
    public void clearContext() {
        ScenarioContext.clear();
    }

}
