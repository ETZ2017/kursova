package edu.zhenia.labtwodb.dao.places.interfaces;

import edu.zhenia.labtwodb.model.Places;

import java.util.List;

public interface IPlacesDao {
    Places save(Places Places);
    Places get(String key);
    List<Places> getAll();
    Places edit(Places group);
    Places delete(String id);
}
