package com.solvd.animals_mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;

import java.util.Objects;

@XmlRootElement(name = "animal")
@XmlAccessorType(XmlAccessType.FIELD)
public class Animal {
    @XmlAttribute
    @JsonProperty
    private Long id;
    @JsonProperty
    @XmlElement
    private String name;
    @JsonProperty
    @XmlElement
    private double weight;
    @JsonProperty
    @XmlAttribute
    private Long genderId;
    @JsonProperty
    @XmlAttribute
    private Long habitatId;
    @JsonProperty
    @XmlAttribute
    private Long feedingId;

    public Animal() {
    }

    public Animal(Long id, String name, double weight, Long genderId,
                  Long habitatId, Long feedingId) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.genderId = genderId;
        this.habitatId = habitatId;
        this.feedingId = feedingId;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Long getGenderId() {
        return genderId;
    }

    public void setGenderId(Long genderId) {
        this.genderId = genderId;
    }

    public Long getHabitatId() {
        return habitatId;
    }

    public void setHabitatId(Long habitatId) {
        this.habitatId = habitatId;
    }

    public Long getFeedingId() {
        return feedingId;
    }

    public void setFeedingId(Long feedingId) {
        this.feedingId = feedingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(weight, animal.weight) == 0 &&
                Objects.equals(id, animal.id) &&
                Objects.equals(name, animal.name) &&
                Objects.equals(genderId, animal.genderId) &&
                Objects.equals(habitatId, animal.habitatId) &&
                Objects.equals(feedingId, animal.feedingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight, genderId, habitatId, feedingId);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", genderId=" + genderId +
                ", habitatId=" + habitatId +
                ", feedingId=" + feedingId +
                '}';
    }
}
