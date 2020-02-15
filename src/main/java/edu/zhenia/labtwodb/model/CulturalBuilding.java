package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class CulturalBuilding {
    private String key;
    private String name;
    private String type;
    private String specials;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public CulturalBuilding(String name, String type, String specials, String description) {
        this.name = name;
        this.type = type;
        this.specials = specials;
        this.description = description;
    }

    public CulturalBuilding() {
    }

    public CulturalBuilding(String key, String name, String type, String specials, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.key = key;
        this.name = name;
        this.type = type;
        this.specials = specials;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecials() {
        return specials;
    }

    public void setSpecials(String specials) {
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
        return getKey().equals(that.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }
}
