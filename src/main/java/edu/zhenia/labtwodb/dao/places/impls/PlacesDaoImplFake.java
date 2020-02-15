package edu.zhenia.labtwodb.dao.places.impls;

import edu.zhenia.labtwodb.dao.places.interfaces.IPlacesDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Places;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlacesDaoImplFake implements IPlacesDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Places save(Places Places) {
        return null;
    }

    @Override
    public Places get(String key) {
        return null;
    }

    @Override
    public List<Places> getAll() {
        return dataSet.getPlaces();
    }

    @Override
    public Places edit(Places group) {
        return null;
    }

    @Override
    public Places delete(String id) {
        return null;
    }
}
