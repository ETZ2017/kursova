package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Places {
    private String key;
    private String place;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Places() {
    }

    public Places(String key, String place, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.key = key;
        this.place = place;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Places(String place) {
        this.place = place;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Places)) return false;
        Places places = (Places) o;
        return getKey().equals(places.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }
}
