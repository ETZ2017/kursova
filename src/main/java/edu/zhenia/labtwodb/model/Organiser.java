package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Organiser {
    private String  key;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Organiser() {
    }

    public Organiser(String key, String firstName, String lastName, String patronymic, String description,
                     LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Organiser(String firstName, String lastName, String patronymic) {
        //this.key = createID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

//    public long getKey() {
//        return key;
//    }


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
        return getKey().equals(organiser.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }
}
