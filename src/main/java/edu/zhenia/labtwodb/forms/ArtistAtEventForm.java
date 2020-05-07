package edu.zhenia.labtwodb.forms;

import java.time.LocalDateTime;

public class ArtistAtEventForm {
    private String id;
    private String artist;
    private String event;
    private String contest;
//    private LocalDateTime dateCreated;
//    private LocalDateTime dateModified;

    public ArtistAtEventForm() {
    }

    public ArtistAtEventForm(String id, String artist, String event, String contest) {
        this.id = id;
        this.artist = artist;
        this.event = event;
        this.contest = contest;
    }


    /*public ArtistAtEventForm(String artist, String event, String contest, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.artist = artist;
        this.event = event;
        this.contest = contest;
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
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getContest() {
        return contest;
    }

    public void setContest(String contest) {
        this.contest = contest;
    }

    @Override
    public String toString() {
        return "ArtistAtEventForm{" +
                "artist='" + artist + '\'' +
                ", event='" + event + '\'' +
                ", contest='" + contest + '\'' +
                '}';
    }
}
