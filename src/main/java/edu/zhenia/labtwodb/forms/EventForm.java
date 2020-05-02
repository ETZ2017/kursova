package edu.zhenia.labtwodb.forms;

import java.time.LocalDateTime;

public class EventForm {
    private String name;
    private String building;
    private String typeOfEvent;
    private String organiser;
    private String contest;
    private String day;
    private String month;
    private String year;
    private String description;

    public EventForm(String name, String building, String typeOfEvent, String organiser,
                     String contest, String day, String month, String year, String description) {
        this.name = name;
        this.building = building;
        this.typeOfEvent = typeOfEvent;
        this.organiser = organiser;
        this.contest = contest;
        this.day = day;
        this.month = month;
        this.year = year;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
                ", building='" + building + '\'' +
                ", typeOfEvent='" + typeOfEvent + '\'' +
                ", organiser='" + organiser + '\'' +
                ", contest='" + contest + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}