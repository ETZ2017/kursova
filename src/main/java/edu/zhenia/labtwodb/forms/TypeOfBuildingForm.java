package edu.zhenia.labtwodb.forms;

public class TypeOfBuildingForm {
    private String type;
    private String description;

    public TypeOfBuildingForm(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public TypeOfBuildingForm() {
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
        return "TypeOfBuildingForm{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
