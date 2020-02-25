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
    private String lastName;
    private String patronymic;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Organiser() {
    }

    public Organiser(String id, String firstName, String lastName, String patronymic, String description,
                     LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Organiser(String firstName, String lastName, String patronymic) {
        //this.id = createID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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
