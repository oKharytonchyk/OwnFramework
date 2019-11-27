package levelUpTask.automation.core.testdata.service

import levelUpTask.automation.core.context.taf.model.person.Credentials
import levelUpTask.automation.core.context.taf.model.person.Person
import levelUpTask.automation.core.context.taf.model.person.PersonalDetails
import levelUpTask.automation.core.testdata.component.CredentialsComponent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonalDetailsServiceImpl implements PersonalDetailsService {

    @Autowired
    private PersonService personService

    @Autowired
    private CredentialsComponent credentialsComponent

    @Override
    PersonalDetails getRandomPersonalDetails() {
        Person person = personService.getRandomPerson()
        Credentials credentials = credentialsComponent.getCredentials(person)
        PersonalDetails.builder()
                .person(person)
                .credentials(credentials)
                .build()
    }

}
