package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Winners {
    @Id
    private String id;
    private Places place;
    private Contest contest;
    private Artist artist;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Winners() {
    }

    public Winners(String id, Places place, Contest contest, Artist artist, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.place = place;
        this.contest = contest;
        this.artist = artist;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Winners(Places place, Contest contest, Artist artist, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.place = place;
        this.contest = contest;
        this.artist = artist;
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

    public Places getPlace() {
        return place;
    }

    public void setPlace(Places place) {
        this.place = place;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Winners)) return false;
        Winners winners = (Winners) o;
        return id.equals(winners.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
