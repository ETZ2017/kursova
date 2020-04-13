package edu.zhenia.labtwodb.forms;

public class ArtistImpressarioForm {
    private String artist;
    private String impressario;

    public ArtistImpressarioForm(String artist, String impressario) {
        this.artist = artist;
        this.impressario = impressario;
    }

    public ArtistImpressarioForm() {
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImpressario() {
        return impressario;
    }

    public void setImpressario(String impressario) {
        this.impressario = impressario;
    }

    @Override
    public String toString() {
        return "ArtistImpressarioForm{" +
                "artist='" + artist + '\'' +
                ", impressario='" + impressario + '\'' +
                '}';
    }
}
