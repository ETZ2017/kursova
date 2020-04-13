package edu.zhenia.labtwodb.forms;

public class WinnersForm {
    private String description;
    private String place;
    private String contest;
    private String artist;

    public WinnersForm(String description) {
        this.description = description;
    }

    public WinnersForm() {
    }

    public WinnersForm(String description, String place, String contest, String artist) {
        this.description = description;
        this.place = place;
        this.contest = contest;
        this.artist = artist;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getContest() {
        return contest;
    }

    public void setContest(String contest) {
        this.contest = contest;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
