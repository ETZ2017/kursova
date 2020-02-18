package edu.zhenia.labtwodb.dao.typeOfEvent.interfaces;

import edu.zhenia.labtwodb.model.TypeOfEvent;

import java.util.List;

public interface ITypeOfEventDao {
    TypeOfEvent save(TypeOfEvent TypeOfEvent);
    TypeOfEvent get(String id);
    List<TypeOfEvent> getAll();
    TypeOfEvent edit(TypeOfEvent group);
    TypeOfEvent delete(String id);
}
