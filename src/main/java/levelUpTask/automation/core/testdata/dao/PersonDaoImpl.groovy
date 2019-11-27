package levelUpTask.automation.core.testdata.dao

import levelUpTask.automation.core.testdata.entity.PersonEntity
import org.springframework.stereotype.Repository

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class PersonDaoImpl implements PersonDao {

    @PersistenceContext
    private EntityManager em

    @Override
    PersonEntity getRandomPerson() {
        em.createNativeQuery("""
            SELECT *
            FROM (SELECT * FROM Person
            order by DBMS_RANDOM.VALUE)
            WHERE rownum <= 1
            """, PersonEntity).singleResult as PersonEntity
    }

}
