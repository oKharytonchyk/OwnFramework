package levelUpTask.automation.core.testdata.service

import levelUpTask.automation.core.context.taf.model.person.Person
import levelUpTask.automation.core.testdata.dao.PersonDao
import levelUpTask.automation.core.testdata.entity.PersonEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao

    @Override
    Person getRandomPerson() {
        PersonEntity randomPerson = personDao.getRandomPerson()
        Person.builder()
                .firstName(randomPerson.firstName)
                .lastName(randomPerson.lastName)
                .build()
    }

}
