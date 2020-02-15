package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Artist {
    private String key;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String genre;
    private String impressario;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public Artist() {
    }

    public Artist(String key, String firstName, String lastName, String patronymic, String genre, String impressario, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.genre = genre;
        this.impressario = impressario;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Artist(String firstName, String lastName, String patronymic, String genre, String impressario) {
       // this.key = createID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.genre = genre;
        this.impressario = impressario;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImpressario() {
        return impressario;
    }

    public void setImpressario(String impressario) {
        this.impressario = impressario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;
        Artist artist = (Artist) o;
        return getKey().equals(artist.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }
}
