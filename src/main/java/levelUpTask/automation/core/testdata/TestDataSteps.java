package levelUpTask.automation.core.testdata;

import levelUpTask.automation.core.context.taf.model.person.PersonalDetails;
import levelUpTask.automation.core.testdata.config.DataBoxConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import(DataBoxConfig.class)
@Component
public class TestDataSteps {

    @Autowired
    private DataBox dataBox;

    public PersonalDetails createPersonalDetails() {
        return dataBox.getRandomPersonalDetails();
    }

}
