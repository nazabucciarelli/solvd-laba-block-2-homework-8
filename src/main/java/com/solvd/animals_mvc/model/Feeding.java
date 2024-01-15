package com.solvd.animals_mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;

import java.util.Objects;

@XmlRootElement(name = "feeding")
@XmlAccessorType(XmlAccessType.FIELD)
public class Feeding {
    @JsonProperty
    @XmlAttribute
    private Long id;
    @JsonProperty
    @XmlElement
    private String name;

    public Feeding() {
    }

    public Feeding(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feeding feeding = (Feeding) o;
        return Objects.equals(id, feeding.id) && Objects.equals(name, feeding.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Feeding{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
