package levelUpTask.automation.api.steps.flow;

import io.restassured.response.Response;
import levelUpTask.automation.api.client.resources.GetPlayers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static levelUpTask.automation.core.context.ScenarioContext.environmentContext;

@Component
public class GetPlayersApiSteps {

    @Autowired
    private GetPlayers resource;

    public void requestAndStoreGetPlayers() {
        environmentContext.setResponse(doApiCall());
    }

    private Response doApiCall() {
        return resource.getCommonRequestSpecification()
                .when().get(resource.getPlayersApiEndpoint());
    }

}
