package edu.zhenia.labtwodb.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Contest {
    private String key;
    private String name;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

    public Contest() {
    }

    public Contest(String name) {
        this.name = name;
       // this.key = createID();
    }

    public Contest(String key, String name, String description, LocalDateTime dateCreated, LocalDateTime dateModified) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
        return getKey().equals(contest.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }
}
