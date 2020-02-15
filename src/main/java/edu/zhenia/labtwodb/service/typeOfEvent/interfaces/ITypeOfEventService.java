package edu.zhenia.labtwodb.service.typeOfEvent.interfaces;

import edu.zhenia.labtwodb.model.TypeOfEvent;

import java.util.List;

public interface ITypeOfEventService {
    TypeOfEvent save(TypeOfEvent TypeOfEvent);
    TypeOfEvent get(String key);
    List<TypeOfEvent> getAll();
    TypeOfEvent edit(TypeOfEvent group);
    TypeOfEvent delete(String id);
}
