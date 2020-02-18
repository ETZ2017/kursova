package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Winners {
    private String id;
    private String place;
    private String contest;
    private String artist;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Winners() {
    }

    public Winners(String id, String place, String contest, String artist, String description, LocalDateTime dateCreated,
                   LocalDateTime dateModified) {
        this.id = id;
        this.place = place;
        this.contest = contest;
        this.artist = artist;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Winners(String place, String contest, String artist) {
        this.place = place;
        this.contest = contest;
        this.artist = artist;
    }

    public String getContest() {
        return contest;
    }

    public void setContest(String contest) {
        this.contest = contest;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
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
