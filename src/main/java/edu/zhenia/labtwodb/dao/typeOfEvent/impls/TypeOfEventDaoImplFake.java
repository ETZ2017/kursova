package edu.zhenia.labtwodb.dao.typeOfEvent.impls;

import edu.zhenia.labtwodb.dao.typeOfEvent.interfaces.ITypeOfEventDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TypeOfEventDaoImplFake implements ITypeOfEventDao {
   @Autowired
    DataSet dataSet;

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
        return dataSet.getTypeOfEvents();
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
