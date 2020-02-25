package edu.zhenia.labtwodb.service.event.impls;

import edu.zhenia.labtwodb.dao.repository.EventRepository;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.event.interfaces.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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
    public Event save(Event Event) {
        return null;
    }

    @Override
    public Event get(String id) {
        return null;
    }

    @Override
    public List<Event> getAll() {
        return repository.findAll();
    }

    @Override
    public Event edit(Event group) {
        return null;
    }

    @Override
    public Event delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
