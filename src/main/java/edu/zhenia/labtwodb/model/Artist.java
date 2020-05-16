package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Artist {
    @Id
    private String id;
    private String firstName;
//    private Genre genre;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public Artist() {
    }

    public Artist(String id, String firstName, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.firstName = firstName;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
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

//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;
        Artist artist = (Artist) o;
        return getid().equals(artist.getid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getid());
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", description='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateModified=" + dateModified +
                '}';
    }
}
