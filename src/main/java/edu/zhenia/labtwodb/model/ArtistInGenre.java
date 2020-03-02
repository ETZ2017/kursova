package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class ArtistInGenre {
    @Id
    private String id;
    private Artist artist;
    private Genre genre;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public ArtistInGenre() {
    }

    public ArtistInGenre(String id, Artist artist, Genre genre) {
        this.id = id;
        this.artist = artist;
        this.genre = genre;
    }

    public ArtistInGenre(String id, Artist artist, Genre genre, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.artist = artist;
        this.genre = genre;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
