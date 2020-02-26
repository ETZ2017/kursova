package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class ArtistAtEvent {
    @Id
    private String id;
    private Artist artist;
    private Event event;

    public ArtistAtEvent(String id, Artist artist, Event event) {
        this.id = id;
        this.artist = artist;
        this.event = event;
    }

    public ArtistAtEvent() {
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
