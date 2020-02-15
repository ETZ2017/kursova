package edu.zhenia.labtwodb.dao.event.impls;

import edu.zhenia.labtwodb.dao.event.interfaces.IEventDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventDaoImplFake implements IEventDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getEvents();
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
