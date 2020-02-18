package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class TypeOfEvent {
    private String id;
    private String type;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public TypeOfEvent() {
    }

    public TypeOfEvent(String id, String type, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public TypeOfEvent(String type) {
        this.type = type;
        //this.id = createID();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypeOfEvent)) return false;
        TypeOfEvent that = (TypeOfEvent) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
