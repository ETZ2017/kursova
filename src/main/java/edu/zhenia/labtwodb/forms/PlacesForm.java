package edu.zhenia.labtwodb.forms;

public class PlacesForm {
    private String place;
    private String description;

    public PlacesForm(String place, String description) {
        this.place = place;
        this.description = description;
    }

    public PlacesForm() {
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PlacesForm{" +
                "place='" + place + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
