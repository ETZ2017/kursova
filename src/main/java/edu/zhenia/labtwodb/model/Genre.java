package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Genre {
    private String key;
    private String genre;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Genre() {
    }

    public Genre(String key, String genre, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.key = key;
        this.genre = genre;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Genre(String genre) {
        this.genre = genre;
        //this.key = createID();
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genre)) return false;
        Genre genre = (Genre) o;
        return getKey().equals(genre.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }
}
