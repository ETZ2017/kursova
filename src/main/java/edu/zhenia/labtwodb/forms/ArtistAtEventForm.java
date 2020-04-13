package edu.zhenia.labtwodb.forms;

public class ArtistAtEventForm {
    private String artist;
    private String event;
    private String contest;

    public ArtistAtEventForm() {
    }

    public ArtistAtEventForm(String artist, String event, String contest) {
        this.artist = artist;
        this.event = event;
        this.contest = contest;
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
