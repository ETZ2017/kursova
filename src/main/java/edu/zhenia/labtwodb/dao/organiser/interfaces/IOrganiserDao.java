package edu.zhenia.labtwodb.dao.organiser.interfaces;

import edu.zhenia.labtwodb.model.Organiser;

import java.util.List;

public interface IOrganiserDao {
    Organiser save(Organiser Organiser);
    Organiser get(String key);
    List<Organiser> getAll();
    Organiser edit(Organiser group);
    Organiser delete(String id);
}
