package edu.zhenia.labtwodb.forms;

public class ArtistForm {
    private String id;
    private String firstname;
    private String genre;
    private String description;

    public ArtistForm() {
    }

    public ArtistForm(String firstname, String genre, String description) {
        this.firstname = firstname;
        this.genre = genre;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ArtistForm{" +
                "firstname='" + firstname + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
