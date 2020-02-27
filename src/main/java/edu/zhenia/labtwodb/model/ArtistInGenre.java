package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtistInGenre that = (ArtistInGenre) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
