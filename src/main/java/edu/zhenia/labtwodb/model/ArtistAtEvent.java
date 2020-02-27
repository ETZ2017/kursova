package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class ArtistAtEvent {
    private String id;
    private Artist artist;
    private Event event;
    private LocalDateTime date;

    public ArtistAtEvent(String id, Artist artist, Event event) {
        this.id = id;
        this.artist = artist;
        this.event = event;
    }

    public ArtistAtEvent() {
    }

    public ArtistAtEvent(String id, Artist artist, Event event, LocalDateTime date) {
        this.id = id;
        this.artist = artist;
        this.event = event;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
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
