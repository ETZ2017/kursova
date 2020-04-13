package edu.zhenia.labtwodb.forms;

public class OrganiserForm {
    private String firstname;
    private String description;

    public OrganiserForm() {
    }

    public OrganiserForm(String firstname, String description) {
        this.firstname = firstname;
        this.description = description;
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
        return "OrganiserForm{" +
                "firstname='" + firstname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
