package edu.zhenia.labtwodb.dataSet;

import edu.zhenia.labtwodb.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataSet {
    private List<edu.zhenia.labtwodb.model.Winners> winners = new ArrayList<>(Arrays.asList(
            new Winners("1",
                    new Places("1","first", "descr", LocalDateTime.now(), LocalDateTime.now()),
                    new Contest("1","name","descr", LocalDateTime.now(), LocalDateTime.now()),
                    new Artist("1", "name",
                            new Genre("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())
                            ,"qwerty", LocalDateTime.now(), LocalDateTime.now()), "qwerty", LocalDateTime.now(),
                    LocalDateTime.now()),
            new Winners("2",
                    new Places("1","first", "descr", LocalDateTime.now(), LocalDateTime.now()),
                    new Contest("1","name","descr", LocalDateTime.now(), LocalDateTime.now()),
                    new Artist("1", "ame",
                            new Genre("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())
                            ,"qwerty", LocalDateTime.now(), LocalDateTime.now()), "qwerty", LocalDateTime.now(),
                    LocalDateTime.now())

    ));

    private List<Artist> artists = new ArrayList<>(Arrays.asList(
            new Artist("1", "name",
                    new Genre("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Artist("2", "name",
                    new Genre("2", "ame", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    private List<Contest> contests = new ArrayList<>(Arrays.asList(
            new Contest("1", "name", "description", LocalDateTime.now(), LocalDateTime.now()),
            new Contest("2", "aame", "description", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<CulturalBuilding> buildings = new ArrayList<>(Arrays.asList(
            new CulturalBuilding("1", "ame",
                    new TypeOfBuilding("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new SpecialFeatures("1", "type",   "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "38","qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new CulturalBuilding("2", "fame",
                    new TypeOfBuilding("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new SpecialFeatures("1", "type",   "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "38","qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    // List<String> artist = new ArrayList<>(Arrays.asList("one", "two"));

    private List<Event> events = new ArrayList<>(Arrays.asList(
            new Event("1", "name",
                    new CulturalBuilding("2", "fame",
                            new TypeOfBuilding("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                            new SpecialFeatures("1", "type",   "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                            "38","qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new TypeOfEvent("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new Organiser("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new Contest("1", "name", "description", LocalDateTime.now(), LocalDateTime.now()),
                    LocalDateTime.now(),"qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Event("2", "ame",
                    new CulturalBuilding("2", "fame",
                            new TypeOfBuilding("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                            new SpecialFeatures("1", "type",   "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                            "38","qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new TypeOfEvent("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new Organiser("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new Contest("1", "name", "description", LocalDateTime.now(), LocalDateTime.now()),
                    LocalDateTime.now(),"qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    private List<ArtistInGenre> artistInGenres = new ArrayList<>(Arrays.asList(
            new ArtistInGenre("1", new Artist("1", "name",
                    new Genre("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new Genre("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()))
    ));

    private List<ArtistImpressario> artistImpressarios = new ArrayList<>(Arrays.asList(
            new ArtistImpressario("1", new Artist("1", "name",
                    new Genre("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new Impressario("1", "name", new Genre("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                            "qwerty", LocalDateTime.now(), LocalDateTime.now()), LocalDateTime.now(), LocalDateTime.now())
    ));

    private List<ArtistAtEvent> artistAtEvents = new ArrayList<>(Arrays.asList(
            new ArtistAtEvent("1", new Artist("1", "name",
                    new Genre("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    new Event("2", "ame",
                            new CulturalBuilding("2", "fame",
                                    new TypeOfBuilding("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                                    new SpecialFeatures("1", "type",   "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                                    "38","qwerty", LocalDateTime.now(), LocalDateTime.now()),
                            new TypeOfEvent("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                            new Organiser("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                            new Contest("1", "name", "description", LocalDateTime.now(), LocalDateTime.now()),
                            LocalDateTime.now(),"qwerty", LocalDateTime.now(), LocalDateTime.now()),  new Contest("1", "name", "description", LocalDateTime.now(), LocalDateTime.now()), LocalDateTime.now())

    ));

    private List<Genre> genres = new ArrayList<>(Arrays.asList(
            new Genre("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Genre("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<Impressario> impressarios = new ArrayList<>(Arrays.asList(
            new Impressario("1", "name", new Genre("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Impressario("2", "ame", new Genre("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
                    "qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    private List<Organiser> organisers = new ArrayList<>(Arrays.asList(
            new Organiser("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Organiser("2","2", "qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    private List<Places> places = new ArrayList<>(Arrays.asList(
            new Places("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Places("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<SpecialFeatures> specialFeatures = new ArrayList<>(Arrays.asList(
            new SpecialFeatures("1", "type",   "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new SpecialFeatures("1", "type",   "qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<TypeOfBuilding> TypeOfBuildings = new ArrayList<>(Arrays.asList(
            new TypeOfBuilding("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new TypeOfBuilding("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<TypeOfEvent> TypeOfEvents = new ArrayList<>(Arrays.asList(
            new TypeOfEvent("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new TypeOfEvent("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    public List<ArtistImpressario> getArtistImpressarios() {
        return artistImpressarios;
    }

    public void setArtistImpressarios(List<ArtistImpressario> artistImpressarios) {
        this.artistImpressarios = artistImpressarios;
    }

    public List<ArtistAtEvent> getArtistAtEvents() {
        return artistAtEvents;
    }

    public List<ArtistInGenre> getArtistInGenres() {
        return artistInGenres;
    }

    public void setArtistInGenres(List<ArtistInGenre> artistInGenres) {
        this.artistInGenres = artistInGenres;
    }

    public void setArtistAtEvents(List<ArtistAtEvent> artistAtEvents) {
        this.artistAtEvents = artistAtEvents;
    }

    public List<TypeOfEvent> getTypeOfEvents() {
        return TypeOfEvents;
    }

    public void setTypeOfEvents(List<TypeOfEvent> typeOfEvents) {
        TypeOfEvents = typeOfEvents;
    }

    public List<TypeOfBuilding> getTypeOfBuildings() {
        return TypeOfBuildings;
    }

    public void setTypeOfBuildings(List<TypeOfBuilding> typeOfBuildings) {
        TypeOfBuildings = typeOfBuildings;
    }

    public List<SpecialFeatures> getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(List<SpecialFeatures> specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public List<Places> getPlaces() {
        return places;
    }

    public void setPlaces(List<Places> places) {
        this.places = places;
    }

    public List<Organiser> getOrganisers() {
        return organisers;
    }

    public void setOrganisers(List<Organiser> organisers) {
        this.organisers = organisers;
    }

    public List<Impressario> getImpressarios() {
        return impressarios;
    }

    public void setImpressarios(List<Impressario> impressarios) {
        this.impressarios = impressarios;
    }

    public List<Winners> getWinners() {
        return winners;
    }

    public void setWinners(List<Winners> winners) {
        this.winners = winners;
    }


    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Contest> getContests() {
        return contests;
    }

    public void setContests(List<Contest> contests) {
        this.contests = contests;
    }

    public List<CulturalBuilding> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<CulturalBuilding> buildings) {
        this.buildings = buildings;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
