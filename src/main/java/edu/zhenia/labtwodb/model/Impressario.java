package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Impressario {
    @Id
    private String id;
    private String firstName;
    private Genre genre;
//    private Artist artist;
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

    public Impressario(String id, String firstName, Genre genre, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.firstName = firstName;
        this.genre = genre;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Impressario(String firstName, Genre genre, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.firstName = firstName;
        this.genre = genre;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Impressario(String firstName, Genre genre,  String description) {
        this.firstName = firstName;
        this.genre = genre;
        this.description = description;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Impressario)) return false;
        Impressario that = (Impressario) o;
        return getid().equals(that.getid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getid());
    }

    @Override
    public String toString() {
        return "Impressario{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", genre=" + genre +
                ", description='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateModified=" + dateModified +
                '}';
    }
}
