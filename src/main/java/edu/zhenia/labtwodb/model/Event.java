package edu.zhenia.labtwodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Document
public class Event {
    @Id
    private String id;
    private String name;
    private CulturalBuilding building;
    private TypeOfEvent typeOfEvent;
    private Organiser organizer;
    //private List artist;
    private Contest contest;
    private LocalDateTime data;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public Event() {
    }

    public Event(String id, String name, CulturalBuilding building, TypeOfEvent typeOfEvent, Contest contest, LocalDateTime data, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.name = name;
        this.building = building;
        this.typeOfEvent = typeOfEvent;
        this.contest = contest;
        this.data = data;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Event(String id, String name, CulturalBuilding building, TypeOfEvent typeOfEvent, Organiser organizer, Contest contest, LocalDateTime data, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.name = name;
        this.building = building;
        this.typeOfEvent = typeOfEvent;
        this.organizer = organizer;
        this.contest = contest;
        this.data = data;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Event(String name, CulturalBuilding building, TypeOfEvent typeOfEvent, Organiser organizer, Contest contest, LocalDateTime data, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.name = name;
        this.building = building;
        this.typeOfEvent = typeOfEvent;
        this.organizer = organizer;
        this.contest = contest;
        this.data = data;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
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

    public CulturalBuilding getBuilding() {
        return building;
    }

    public void setBuilding(CulturalBuilding building) {
        this.building = building;
    }

    public TypeOfEvent getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(TypeOfEvent typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public Organiser getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organiser organizer) {
        this.organizer = organizer;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
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
