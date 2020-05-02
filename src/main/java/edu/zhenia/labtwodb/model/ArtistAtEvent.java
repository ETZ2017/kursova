package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Objects;

public class ArtistAtEvent {
    @Id
    private String id;
    private Artist artist;
    private Event event;
//    private Contest contest;
    private LocalDateTime date;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public ArtistAtEvent(String id, Artist artist, Event event, Contest contest, LocalDateTime date) {
        this.id = id;
        this.artist = artist;
        this.event = event;
//        this.contest = contest;
        this.date = date;
    }

    public ArtistAtEvent() {
    }

    public ArtistAtEvent(String id, Artist artist, Event event, Contest contest, LocalDateTime date, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.artist = artist;
        this.event = event;
//        this.contest = contest;
        this.date = date;
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

    /*public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }*/

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
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

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtistAtEvent that = (ArtistAtEvent) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
