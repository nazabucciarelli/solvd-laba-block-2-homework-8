package com.solvd.animals_mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;

import java.util.Objects;

@XmlRootElement(name = "animalRoom")
@XmlAccessorType(XmlAccessType.FIELD)
public class AnimalRoom {
    @JsonProperty
    @XmlAttribute
    private Long id;
    @JsonProperty
    @XmlElement
    private String name;
    @JsonProperty
    @XmlElement
    private int capacity;
    @JsonProperty
    @XmlAttribute
    private Long zooId;

    public AnimalRoom() {
    }

    public AnimalRoom(Long id, String name, int capacity, Long zooId) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.zooId = zooId;
    }

    public AnimalRoom(String name, int capacity, Long zooId) {
        this.name = name;
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
        AnimalRoom that = (AnimalRoom) o;
        return capacity == that.capacity && Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, capacity);
    }

    @Override
    public String toString() {
        return "AnimalRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
