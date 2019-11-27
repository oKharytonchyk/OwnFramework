package levelUpTask.automation.core.context.taf.model.person

import groovy.transform.AutoClone
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.builder.Builder

@ToString
@Builder
@EqualsAndHashCode
@AutoClone
class PersonalDetails {

    Person person = new Person()
    Credentials credentials = new Credentials()

}
