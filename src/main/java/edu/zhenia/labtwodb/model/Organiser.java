package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Organiser {
    @Id
    private String  id;
    private String firstName;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public Organiser(String firstName, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.firstName = firstName;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Organiser() {
    }

    public Organiser(String id, String firstName, String description,
                     LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.firstName = firstName;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Organiser(String firstName, String description) {
        this.firstName = firstName;
        this.description = description;
    }

    //    public long getid() {
//        return id;
//    }


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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Organiser)) return false;
        Organiser organiser = (Organiser) o;
        return getid().equals(organiser.getid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getid());
    }
}
