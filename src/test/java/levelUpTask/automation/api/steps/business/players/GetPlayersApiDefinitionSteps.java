package levelUpTask.automation.api.steps.business.players;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.common.mapper.TypeRef;
import levelUpTask.automation.api.client.model.PlayerDTO;
import levelUpTask.automation.api.steps.composite.CallableService;
import levelUpTask.automation.storefront.business.common.CucumberStepDefinitions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

import static levelUpTask.automation.core.context.ScenarioContext.environmentContext;
import static org.assertj.core.api.Assertions.assertThat;

public class GetPlayersApiDefinitionSteps extends CucumberStepDefinitions {

    @Autowired
    @Qualifier("GetPlayersCompositeSteps")
    private CallableService callableService;

    @When("^Client calls Get Players service$")
    public void callGetPlayers() {
        callableService.call();
    }

    @Then("^every player in response contains code, nickName$")
    public void verifyPlayers() {
        List<PlayerDTO> actualResponse = environmentContext.getResponse().as(new TypeRef<>() {
        });
        assertThat(actualResponse)
                .allMatch(player -> !player.getPlayerId().isEmpty() && !player.getMatchName().isEmpty());
    }

}
