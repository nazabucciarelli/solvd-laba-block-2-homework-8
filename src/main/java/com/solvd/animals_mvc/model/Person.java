package com.solvd.animals_mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.solvd.animals_mvc.model.exception.EmptyFieldException;
import jakarta.xml.bind.annotation.*;

import java.util.Date;
import java.util.Objects;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @JsonProperty
    @XmlAttribute
    private Long id;
    @JsonProperty
    @XmlElement
    private Date birthDate; // This field was 'age' previously, but I changed it into Date to accomplish the JAXB homework requirements.
    @JsonProperty
    @XmlElement
    private String firstName;
    @JsonProperty
    @XmlElement
    private String lastName;
    @JsonProperty
    @XmlAttribute
    private Long genderId;
    @JsonProperty
    @XmlAttribute
    private Long countryId;
    @JsonProperty
    @XmlElement
    private String phoneNumber;

    public Person() {
    }

    public Person(Long id, Date birthDate, String firstName, String lastName,
                  Long genderId, Long countryId, String phoneNumber) {
        this.id = id;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genderId = genderId;
        this.countryId = countryId;
        this.phoneNumber = phoneNumber;
    }

    public Person(Date birthDate, String firstName, String lastName, Long genderId,
                  Long countryId, String phoneNumber) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genderId = genderId;
        this.countryId = countryId;
        this.phoneNumber = phoneNumber;
    }

    public Long getCustomerId() {
        return id;
    }

    public void setCustomerId(Long customerId) {
        this.id = customerId;
    }

    public Long getGenderId() {
        return genderId;
    }

    public void setGenderId(Long genderId) {
        this.genderId = genderId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isBlank()) {
            throw new EmptyFieldException("Field first name cannot be empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.isBlank()) {
            throw new EmptyFieldException("Field last name cannot be empty");
        }
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getGender() {
        return genderId;
    }

    public void setGender(Long genderId) {
        this.genderId = genderId;
    }

    public Long getCountry() {
        return countryId;
    }

    public void setCountry(Long countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) &&
                Objects.equals(birthDate, person.birthDate) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(genderId, person.genderId) &&
                Objects.equals(countryId, person.countryId) &&
                Objects.equals(phoneNumber, person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, birthDate, firstName, lastName, genderId,
                countryId, phoneNumber);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", genderId=" + genderId +
                ", countryId=" + countryId +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
