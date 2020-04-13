package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class CulturalBuilding {
    @Id
    private String id;
    private String name;
    private TypeOfBuilding type;
    private SpecialFeatures specials;
    private String value;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public CulturalBuilding(String id, String name, TypeOfBuilding type, SpecialFeatures specials, String value, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.specials = specials;
        this.value = value;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public CulturalBuilding() {
    }


    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfBuilding getType() {
        return type;
    }

    public void setType(TypeOfBuilding type) {
        this.type = type;
    }

    public SpecialFeatures getSpecials() {
        return specials;
    }

    public void setSpecials(SpecialFeatures specials) {
        this.specials = specials;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CulturalBuilding)) return false;
        CulturalBuilding that = (CulturalBuilding) o;
        return getid().equals(that.getid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getid());
    }

    @Override
    public String toString() {
        return "CulturalBuilding{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", specials=" + specials +
                ", value='" + value + '\'' +
                ", description='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateModified=" + dateModified +
                '}';
    }
}
