package edu.zhenia.labtwodb.model;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Event {
    private String id;
    private String name;
    private String building;
    private String typeOfEvent;
    private String organizer;
    private List artist;
    private String contest;
    private LocalDateTime data;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Event() {
    }

    public Event(String id, String name, String building, String typeOfEvent, String organizer, List artist, String contest,
                 LocalDateTime data,  String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.name = name;
        this.building = building;
        this.typeOfEvent = typeOfEvent;
        this.organizer = organizer;
        this.artist = artist;
        this.contest = contest;
        this.data = data;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Event(String name, String building, String typeOfEvent, String organizer, List artist, String contest,
                 LocalDateTime data) {
//        this.id = id;
        this.name = name;
        this.building = building;
        this.typeOfEvent = typeOfEvent;
        this.organizer = organizer;
        this.artist = artist;
        this.contest = contest;
        this.data = data;
    }


    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
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

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public List getArtist() {
        return artist;
    }

    public void setArtist(List artist) {
        this.artist = artist;
    }

    public String getContest() {
        return contest;
    }

    public void setContest(String contest) {
        this.contest = contest;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getid().equals(event.getid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getid());
    }
}
