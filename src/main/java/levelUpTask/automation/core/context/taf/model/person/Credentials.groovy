package levelUpTask.automation.core.context.taf.model.person

import groovy.transform.AutoClone
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.builder.Builder

@ToString
@Builder
@EqualsAndHashCode
@AutoClone
class Credentials {

    String login
    String password

    Credentials() {}

    Credentials(String login, String password) {
        this.login = login
        this.password = password
    }

}
