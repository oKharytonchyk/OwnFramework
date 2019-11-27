package levelUpTask.automation.api.client.resources;

import levelUpTask.automation.api.steps.business.common.CommonApiSteps;
import org.springframework.stereotype.Component;

@Component
public class GetPlayers extends CommonApiSteps {

    public String getPlayersApiEndpoint() {
        return super.getApiEndpoint() + "/v3/csgo/scores/json/Players";
    }

}
