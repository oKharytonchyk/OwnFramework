package levelUpTask.automation.core.testdata.entity

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@ToString
@EqualsAndHashCode
@Entity
@Table(name = 'Person')
class PersonEntity {

    @Id
    @Column(name = 'id')
    int id

    @Column(name = 'firstName')
    String firstName

    @Column(name = 'lastName')
    String lastName

}
