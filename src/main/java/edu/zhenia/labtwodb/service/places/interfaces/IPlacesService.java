package edu.zhenia.labtwodb.service.places.interfaces;

import edu.zhenia.labtwodb.model.Places;

import java.util.List;

public interface IPlacesService {
    Places save(Places Places);
    Places get(String id);
    List<Places> getAll();
    Places edit(Places group);
    Places delete(String id);

}
