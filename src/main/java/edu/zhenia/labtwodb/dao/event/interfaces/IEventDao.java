package edu.zhenia.labtwodb.dao.event.interfaces;

import edu.zhenia.labtwodb.model.Event;

import java.util.List;

public interface IEventDao {
    Event save(Event Event);
    Event get(String key);
    List<Event> getAll();
    Event edit(Event group);
    Event delete(String id);
}
