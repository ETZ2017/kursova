package edu.zhenia.labtwodb.service.typeOfEvent.impls;

import edu.zhenia.labtwodb.dao.typeOfEvent.impls.TypeOfEventDaoImplFake;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfEvent.interfaces.ITypeOfEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfEventServiceImpl implements ITypeOfEventService {
    @Autowired
    TypeOfEventDaoImplFake dao;

    @Override
    public TypeOfEvent save(TypeOfEvent TypeOfEvent) {
        return null;
    }

    @Override
    public TypeOfEvent get(String key) {
        return null;
    }

    @Override
    public List<TypeOfEvent> getAll() {
        return dao.getAll();
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
