package edu.zhenia.labtwodb.forms;

public class TypeOfEventForm {
    private String type;
    private String description;

    public TypeOfEventForm(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public TypeOfEventForm() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TypeOfEventForm{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
