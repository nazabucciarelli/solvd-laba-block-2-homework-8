package com.solvd.animals_mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;

import java.sql.Date;
import java.util.Objects;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee extends Person {
    @JsonProperty
    @XmlAttribute
    private Long id;
    @JsonProperty
    @XmlElement
    private Date entryDate;
    @JsonProperty
    @XmlElement
    private double salary;
    @JsonProperty
    @XmlAttribute
    private Long personId;
    @JsonProperty
    @XmlAttribute
    private Long employeeIdentifierId;

    public Employee() {
    }

    public Employee(Date birthDate, String firstName, String lastName, Long genderId,
                    Long countryId, Long id, Date entryDate, double salary,
                    Long personId, Long employeeIdentifierId,
                    String phoneNumber) {
        super(birthDate, firstName, lastName, genderId, countryId, phoneNumber);
        this.id = id;
        this.entryDate = entryDate;
        this.salary = salary;
        this.personId = personId;
        this.employeeIdentifierId = employeeIdentifierId;
    }

    public Long getCustomerId() {
        return id;
    }

    public void setCustomerId(Long customerId) {
        this.id = customerId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getEmployeeIdentifierId() {
        return employeeIdentifierId;
    }

    public void setEmployeeIdentifierId(Long employeeIdentifierId) {
        this.employeeIdentifierId = employeeIdentifierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 &&
                Objects.equals(id, employee.id) &&
                Objects.equals(entryDate, employee.entryDate) &&
                Objects.equals(personId, employee.personId) &&
                Objects.equals(employeeIdentifierId,
                        employee.employeeIdentifierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, entryDate, salary, personId, employeeIdentifierId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", entryDate=" + entryDate +
                ", salary=" + salary +
                ", personId=" + personId +
                ", employeeIdentifierId=" + employeeIdentifierId +
                '}';
    }
}
