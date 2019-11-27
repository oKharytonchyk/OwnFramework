package levelUpTask.automation.core.testdata.component

import levelUpTask.automation.core.context.taf.model.person.Credentials
import levelUpTask.automation.core.context.taf.model.person.Person
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

import java.lang.management.ManagementFactory
import java.text.SimpleDateFormat

@Component
class CredentialsComponent {

    @Value('${domain}')
    private String domain

    @Value('${default.password}')
    private String defaultPassword


    Credentials getCredentials(Person person) {
        String email = "${person.firstName.charAt(0)}${person.lastName}${timestamp}${jvmId}${threadId}@${domain}"
        new Credentials(email, defaultPassword)
    }

    private static String getTimestamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss")
        simpleDateFormat.format(new Date())
    }

    private static String getJvmId() {
        ManagementFactory.runtimeMXBean.name.split('@').first()
    }

    private static String getThreadId() {
        Thread.currentThread().id
    }

}
