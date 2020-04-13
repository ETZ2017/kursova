package edu.zhenia.labtwodb.forms;

public class ImpressarioForm {
    private String firstname;
    private String genre;
    private String description;

    public ImpressarioForm() {
    }

    public ImpressarioForm(String firstname, String description) {
        this.firstname = firstname;
        this.description = description;
    }

    public ImpressarioForm(String firstname, String genre, String description) {
        this.firstname = firstname;
        this.genre = genre;
        this.description = description;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
        return "ImpressarioForm{" +
                "firstname='" + firstname + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
