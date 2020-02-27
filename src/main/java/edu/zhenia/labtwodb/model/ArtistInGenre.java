package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;

public class ArtistInGenre {
    @Id
    private String id;
    private Artist artist;
    private Genre genre;

    public ArtistInGenre() {
    }

    public ArtistInGenre(String id, Artist artist, Genre genre) {
        this.id = id;
        this.artist = artist;
        this.genre = genre;
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
