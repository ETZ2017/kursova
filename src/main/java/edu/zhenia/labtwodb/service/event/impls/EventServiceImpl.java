package edu.zhenia.labtwodb.service.event.impls;

import edu.zhenia.labtwodb.dao.event.impls.EventDaoImplFake;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.event.interfaces.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements IEventService {
    @Autowired
    EventDaoImplFake dao;

    @Override
    public Event save(Event Event) {
        return null;
    }

    @Override
    public Event get(String key) {
        return null;
    }

    @Override
    public List<Event> getAll() {
        return dao.getAll();
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
