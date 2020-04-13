package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class ArtistImpressario {
    @Id
    private String id;
    private Artist artist;
    private Impressario Impressario;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public ArtistImpressario() {
    }

    public ArtistImpressario(String id, Artist artist, edu.zhenia.labtwodb.model.Impressario impressario) {
        this.id = id;
        this.artist = artist;
        Impressario = impressario;
    }

    public ArtistImpressario(String id, Artist artist, edu.zhenia.labtwodb.model.Impressario impressario, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.artist = artist;
        Impressario = impressario;
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

    public edu.zhenia.labtwodb.model.Impressario getImpressario() {
        return Impressario;
    }

    public void setImpressario(edu.zhenia.labtwodb.model.Impressario impressario) {
        Impressario = impressario;
    }

    @Override
    public String toString() {
        return "ArtistImpressario{" +
                "id='" + id + '\'' +
                ", artist=" + artist +
                ", Impressario=" + Impressario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtistImpressario that = (ArtistImpressario) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
