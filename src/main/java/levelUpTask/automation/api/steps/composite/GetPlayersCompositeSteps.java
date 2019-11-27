package levelUpTask.automation.api.steps.composite;

import levelUpTask.automation.api.steps.flow.GetPlayersApiSteps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("GetPlayersCompositeSteps")
public class GetPlayersCompositeSteps implements CallableService {

    @Autowired
    private GetPlayersApiSteps steps;

    @Override
    public void call() {
        steps.requestAndStoreGetPlayers();
    }

}
