package com.solvd.animals_mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;

import java.util.Date;
import java.util.Objects;

@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer extends Person {
    @JsonProperty
    @XmlAttribute
    private Long customerId;
    @JsonProperty
    @XmlElement
    private int timesVisitingZoo;
    @JsonProperty
    @XmlAttribute
    private Long personId;

    public Customer() {
    }

    public Customer(Date birthDate, String firstName, String lastName, Long genderId,
                    Long countryId, Long customerId, int timesVisitingZoo, Long personId, String
                            phoneNumber) {
        super(birthDate, firstName, lastName, genderId, countryId, phoneNumber);
        this.customerId = customerId;
        this.timesVisitingZoo = timesVisitingZoo;
        this.personId = personId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public int getTimesVisitingZoo() {
        return timesVisitingZoo;
    }

    public void setTimesVisitingZoo(int timesVisitingZoo) {
        this.timesVisitingZoo = timesVisitingZoo;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return timesVisitingZoo == customer.timesVisitingZoo &&
                Objects.equals(customerId, customer.customerId) &&
                Objects.equals(personId, customer.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, timesVisitingZoo, personId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + customerId +
                ", timesVisitingZoo=" + timesVisitingZoo +
                ", personId=" + personId +
                '}';
    }
}
