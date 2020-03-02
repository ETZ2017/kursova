package edu.zhenia.labtwodb.service.event.impls;

import edu.zhenia.labtwodb.dao.repository.EventRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.event.interfaces.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
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
}
