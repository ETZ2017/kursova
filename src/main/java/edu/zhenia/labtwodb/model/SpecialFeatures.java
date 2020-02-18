package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class SpecialFeatures {
    private String id;
    private String type;
    private String value;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public SpecialFeatures() {
    }

    public SpecialFeatures(String id, String type, String value, String description, LocalDateTime dateCreated,
                           LocalDateTime dateModified) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public SpecialFeatures(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpecialFeatures)) return false;
        SpecialFeatures that = (SpecialFeatures) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
