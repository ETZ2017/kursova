package edu.zhenia.labtwodb.dao.typeOfEvent.impls;

import edu.zhenia.labtwodb.dao.typeOfEvent.interfaces.ITypeOfEventDao;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;

import java.util.List;

public class TypeOfEventImplFake implements ITypeOfEventDao {
    TypeOfEventServiceImpl service;
    @Override
    public TypeOfEvent save(TypeOfEvent TypeOfEvent) {
        return null;
    }

    @Override
    public TypeOfEvent get(String id) {
        return null;
    }

    @Override
    public List<TypeOfEvent> getAll() {
        return service.getAll();
    }

    @Override
    public TypeOfEvent edit(TypeOfEvent group) {
        return null;
    }

    @Override
    public TypeOfEvent delete(String id) {
        return null;
    }
}
