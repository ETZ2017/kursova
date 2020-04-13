package edu.zhenia.labtwodb.forms;

import java.time.LocalDateTime;

public class EventForm {
    private String name;
    private String building;
    private String typeOfEvent;
    private String organiser;
    private String contest;
    private LocalDateTime date;
    private String description;

    public EventForm(String name, LocalDateTime date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public EventForm(String name, String building, String typeOfEvent, String organiser, String contest, LocalDateTime date, String description) {
        this.name = name;
        this.building = building;
        this.typeOfEvent = typeOfEvent;
        this.organiser = organiser;
        this.contest = contest;
        this.date = date;
        this.description = description;
    }

    public EventForm(String name, String building, String typeOfEvent, String contest, LocalDateTime date, String description) {
        this.name = name;
        this.building = building;
        this.typeOfEvent = typeOfEvent;
        this.contest = contest;
        this.date = date;
        this.description = description;
    }

    public EventForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public String getContest() {
        return contest;
    }

    public void setContest(String contest) {
        this.contest = contest;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EventForm{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
