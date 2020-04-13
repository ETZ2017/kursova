package edu.zhenia.labtwodb.forms;

public class ArtistInGenreForm {
    private String artist;
    private String genre;

    public ArtistInGenreForm(String artist, String genre) {
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

    @Override
    public String toString() {
        return "ArtistInGenreForm{" +
                "artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
