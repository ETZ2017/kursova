package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Impressario {
    private String key;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String genre;
    private String artist;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


//    private static String idCounter = 0;
//
//    private static synchronized String createID(){
//        return idCounter++;
//    }

    public Impressario() {
    }

    public Impressario(String key, String firstName, String lastName, String patronymic, String genre, String artist, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.genre = genre;
        this.artist = artist;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Impressario(String firstName, String lastName, String patronymic, String genre, String artist) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.genre = genre;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    //    public String getKey() {
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Impressario)) return false;
        Impressario that = (Impressario) o;
        return getKey().equals(that.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }
}
