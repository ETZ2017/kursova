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
            new Winners("1", "place", "contest", "artist", "qwerty", LocalDateTime.now(),
                    LocalDateTime.now()),
            new Winners("2", "place", "contest", "artist", "qwerty", LocalDateTime.now(),
                    LocalDateTime.now())

    ));

    private List<Artist> artists = new ArrayList<>(Arrays.asList(
            new Artist("1", "name", "last name", "patronymic", "jazz",
                    "man", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Artist("2", "name", "last name", "patronymic", "jazz",
                    "man", "qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    private List<Contest> contests = new ArrayList<>(Arrays.asList(
            new Contest("1", "name", "description", LocalDateTime.now(), LocalDateTime.now()),
            new Contest("2", "name", "description", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<CulturalBuilding> buildings = new ArrayList<>(Arrays.asList(
            new CulturalBuilding("1", "name", "type", "specials", "qwerty",
                    LocalDateTime.now(), LocalDateTime.now()),
            new CulturalBuilding("2", "name", "type", "specials", "qwerty",
                    LocalDateTime.now(), LocalDateTime.now())

    ));

   // List<String> artist = new ArrayList<>(Arrays.asList("one", "two"));

    private List<Event> events = new ArrayList<>(Arrays.asList(
            new Event("1", "name", "building", "type", "organiser", "some", LocalDateTime.now(),"qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Event("2", "name", "building", "type", "organiser", "some", LocalDateTime.now(),"qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<ArtistAtEvent> artistAtEvents = new ArrayList<>(Arrays.asList(
            new ArtistAtEvent("1", new Artist("1", "name", "last name", "patronymic", "jazz",
                    "man", "qwerty", LocalDateTime.now(), LocalDateTime.now()), new Event("2", "name", "building", "type", "organiser", "some", LocalDateTime.now(),"qwerty", LocalDateTime.now(), LocalDateTime.now()))

    ));

    private List<Genre> genres = new ArrayList<>(Arrays.asList(
            new Genre("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Genre("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<Impressario> impressarios = new ArrayList<>(Arrays.asList(
            new Impressario("1", "name", "last name", "patronymic", "jazz",
                    "man", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Impressario("2", "name", "last name", "patronymic", "jazz",
                    "man", "qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    private List<Organiser> organisers = new ArrayList<>(Arrays.asList(
            new Organiser("1", "name", "last name", "patronymic","qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Organiser("2", "name", "last name", "patronymic","qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    private List<Places> places = new ArrayList<>(Arrays.asList(
            new Places("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new Places("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<SpecialFeatures> specialFeatures = new ArrayList<>(Arrays.asList(
            new SpecialFeatures("1", "type", "value",  "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new SpecialFeatures("1", "type", "value",  "qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<TypeOfBuilding> TypeOfBuildings = new ArrayList<>(Arrays.asList(
            new TypeOfBuilding("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new TypeOfBuilding("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())

    ));

    private List<TypeOfEvent> TypeOfEvents = new ArrayList<>(Arrays.asList(
            new TypeOfEvent("1", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now()),
            new TypeOfEvent("2", "name", "qwerty", LocalDateTime.now(), LocalDateTime.now())
    ));

    public List<ArtistAtEvent> getArtistAtEvents() {
        return artistAtEvents;
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
