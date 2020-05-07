package edu.zhenia.labtwodb.forms;

public class ArtistInGenreForm {
    private String id;
    private String artist;
    private String genre;

    public ArtistInGenreForm(String id, String artist, String genre) {
        this.id = id;
        this.artist = artist;
        this.genre = genre;
    }

    public ArtistInGenreForm() {
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArtistInGenreForm{" +
                "artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
