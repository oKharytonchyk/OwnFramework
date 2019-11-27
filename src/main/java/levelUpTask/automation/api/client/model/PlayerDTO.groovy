package levelUpTask.automation.api.client.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.xml.bind.annotation.XmlElement

@ToString
@EqualsAndHashCode
class PlayerDTO {

    @XmlElement(name = "PlayerId")
    String PlayerId

    @XmlElement(name = "FirstName")
    String FirstName

    @XmlElement(name = "LastName")
    String LastName

    @XmlElement(name = "CommonName")
    String CommonName

    @XmlElement(name = "MatchName")
    String MatchName

    @XmlElement(name = "Position")
    String Position

    @XmlElement(name = "Gender")
    String Gender

    @XmlElement(name = "BirthDate")
    String BirthDate

    @XmlElement(name = "BirthCity")
    String BirthCity

    @XmlElement(name = "BirthCountry")
    String BirthCountry

    @XmlElement(name = "Nationality")
    String Nationality

    @XmlElement(name = "Updated")
    String Updated

}
