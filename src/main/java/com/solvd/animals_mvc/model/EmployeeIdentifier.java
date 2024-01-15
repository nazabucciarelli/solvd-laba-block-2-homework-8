package com.solvd.animals_mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;

import java.util.Objects;

@XmlRootElement(name = "employeeIdentifier")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeIdentifier {
    @JsonProperty
    @XmlAttribute
    private Long id;
    @JsonProperty
    @XmlAttribute
    private Long positionId;
    @JsonProperty
    @XmlAttribute
    private Long departmentId;
    @JsonProperty
    @XmlElement
    private String identificationCode;
    @JsonProperty
    @XmlElement
    private String imageUrl;

    public EmployeeIdentifier() {
    }

    public EmployeeIdentifier(Long id, Long positionId, Long departmentId,
                              String identificationCode, String imageUrl) {
        this.id = id;
        this.positionId = positionId;
        this.departmentId = departmentId;
        this.identificationCode = identificationCode;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeIdentifier that = (EmployeeIdentifier) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(positionId, that.positionId) &&
                Objects.equals(departmentId, that.departmentId) &&
                Objects.equals(identificationCode, that.identificationCode) &&
                Objects.equals(imageUrl, that.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, positionId, departmentId, identificationCode,
                imageUrl);
    }

    @Override
    public String toString() {
        return "EmployeeIdentifier{" +
                "id=" + id +
                ", positionId=" + positionId +
                ", departmentId=" + departmentId +
                ", identificationCode='" + identificationCode + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
