package levelUpTask.automation.core.testdata

import levelUpTask.automation.core.context.taf.model.person.PersonalDetails
import levelUpTask.automation.core.testdata.service.PersonalDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DataBox {

    @Autowired
    private PersonalDetailsService personalDetailsService

    PersonalDetails getRandomPersonalDetails() {
        personalDetailsService.getRandomPersonalDetails()
    }

}
