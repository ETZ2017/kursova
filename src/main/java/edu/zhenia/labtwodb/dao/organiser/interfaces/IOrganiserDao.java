package edu.zhenia.labtwodb.dao.organiser.interfaces;

import edu.zhenia.labtwodb.model.Organiser;

import java.util.List;

public interface IOrganiserDao {
    Organiser save(Organiser Organiser);
    Organiser get(String id);
    List<Organiser> getAll();
    Organiser edit(Organiser group);
    Organiser delete(String id);
}
