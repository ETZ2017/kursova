package edu.zhenia.labtwodb.forms;

public class GenreForm {
    private String name;
    private String description;

    public GenreForm(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public GenreForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GenreForm{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
