package com.solvd.animals_mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;

import java.util.Objects;

@XmlRootElement(name = "department")
@XmlAccessorType(XmlAccessType.FIELD)
public class Department {
    @JsonProperty
    @XmlAttribute
    private Long id;
    @JsonProperty
    @XmlElement
    private String name;
    @JsonProperty
    @XmlAttribute
    private Long zooId;

    public Department() {
    }

    public Department(Long id, String name, Long zooId) {
        this.id = id;
        this.name = name;
        this.zooId = zooId;
    }

    public Department(String name, Long zooId) {
        this.name = name;
        this.zooId = zooId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getZooId() {
        return zooId;
    }

    public void setZooId(Long zooId) {
        this.zooId = zooId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(zooId, that.zooId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, zooId);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zooId=" + zooId +
                '}';
    }
}
