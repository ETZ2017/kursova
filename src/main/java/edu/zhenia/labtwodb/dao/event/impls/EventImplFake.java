package edu.zhenia.labtwodb.dao.event.impls;

import edu.zhenia.labtwodb.dao.event.interfaces.IEventDao;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.event.impls.EventServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventImplFake implements IEventDao {
    EventServiceImpl service;
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
        return service.getAll();
    }

    @Override
    public Event edit(Event group) {
        return null;
    }

    @Override
    public Event delete(String id) {
        return null;
    }
}
