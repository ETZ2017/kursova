package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Places {
    @Id
    private String id;
    private String place;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Places() {
    }

    public Places(String id, String place, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.place = place;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Places(String place) {
        this.place = place;
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
        return getid().equals(places.getid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getid());
    }
}
