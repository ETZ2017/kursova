package edu.zhenia.labtwodb.forms;

import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.model.TypeOfBuilding;

public class CulturalBuildingForm {
    private String name;
    private String type;
    private String specials;
    private String value;
    private String description;

    public CulturalBuildingForm() {
    }

    public CulturalBuildingForm(String name, String type, String specials, String value, String description) {
        this.name = name;
        this.type = type;
        this.specials = specials;
        this.value = value;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecials() {
        return specials;
    }

    public void setSpecials(String specials) {
        this.specials = specials;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CulturalBuildingForm{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", specials='" + specials + '\'' +
                ", value='" + value + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
