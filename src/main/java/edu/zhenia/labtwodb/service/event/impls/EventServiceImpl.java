package edu.zhenia.labtwodb.service.event.impls;

import edu.zhenia.labtwodb.dao.repository.EventRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.culturalBuilding.impls.CulturalBuildingServiceImpl;
import edu.zhenia.labtwodb.service.event.interfaces.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class EventServiceImpl implements IEventService {

    @Autowired
    EventRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Event save(Event event) {
        event.setDateCreated(LocalDateTime.now());
        event.setDateModified(LocalDateTime.now());
        return repository.save(event);
    }

    @Override
    public Event get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Event> getAll() {
        return repository.findAll();
    }

    @Override
    public Event edit(Event event) {
        event.setDateModified(LocalDateTime.now());
        return repository.save(event);
    }

    @Override
    public Event delete(String id) {
        Event artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }

    public List<Event> searchByName(String word) {
        List<Event> events = this.getAll();
        List<Event> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Event event : events) {
            if (event.getName().toLowerCase().contains(temp)||
                    event.getName().contains(word)) {
                found.add(event);
            }
        }

        return found;
    }

    public List<Event> searchByBuilding(String word) {
        List<Event> events = this.getAll();
        List<Event> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Event event : events) {
            if (event.getBuilding().getName().toLowerCase().contains(temp)||
                    event.getBuilding().getName().contains(word)) {
                found.add(event);
            }
        }

        return found;
    }

    public List<Event> searchByType(String word) {
        List<Event> events = this.getAll();
        List<Event> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Event event : events) {
            if (event.getTypeOfEvent().getType().toLowerCase().contains(temp)||
                    event.getTypeOfEvent().getType().contains(word)) {
                found.add(event);
            }
        }

        return found;
    }

    public List<Event> searchByOrganiser(String word) {
        List<Event> events = this.getAll();
        List<Event> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Event event : events) {
            if (event.getOrganizer().getFirstName().toLowerCase().contains(temp)||
                    event.getOrganizer().getFirstName().contains(word)) {
                found.add(event);
            }
        }

        return found;
    }

    public List<Event> searchByContest(String word) {
        List<Event> events = this.getAll();
        List<Event> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Event event : events) {
            if (event.getContest().getName().toLowerCase().contains(temp)||
                    event.getContest().getName().contains(word)) {
                found.add(event);
            }
        }

        return found;
    }

    public List<Event> searchByDate(String dayBeg, String monthBeg, String yearBeg,
                                    String dayEnd, String monthEnd, String yearEnd) {
        List<Event> events = this.getAll();
        List<Event> found = new ArrayList<>();

        LocalDate beginning = LocalDate.parse(yearBeg+"-"+monthBeg+"-"+dayBeg);
        LocalDate ending = LocalDate.parse(yearEnd+"-"+monthEnd+"-"+dayEnd);

        for (Event event : events) {
            if (event.getData().compareTo(beginning) > 0 && ending.compareTo(event.getData()) > 0 ||
                    event.getData().compareTo(beginning) == 0 && ending.compareTo(event.getData()) > 0 ||
                    event.getData().compareTo(beginning) > 0 && ending.compareTo(event.getData()) == 0 ||
                    event.getData().compareTo(beginning) == 0 && ending.compareTo(event.getData()) == 0
                ) {
                found.add(event);
            }
        }

        return found;
    }


    public List<Event> sortByName(List<Event> events){

        Collections.sort(events, new EventServiceImpl.EventNameComparator());

        return events;
    }

    private class EventNameComparator implements Comparator<Event> {
        public int compare(Event p1, Event p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
