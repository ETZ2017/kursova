package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Contest {
    private String id;
    private String name;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public Contest() {
    }

    public Contest(String name) {
        this.name = name;
       // this.id = createID();
    }

    public Contest(String id, String name, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contest)) return false;
        Contest contest = (Contest) o;
        return getid().equals(contest.getid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getid());
    }
}
