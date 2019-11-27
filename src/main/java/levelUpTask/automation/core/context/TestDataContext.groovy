package levelUpTask.automation.core.context

import levelUpTask.automation.core.context.taf.model.person.PersonalDetails
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
class TestDataContext {

    PersonalDetails personalDetails = new PersonalDetails()

}
