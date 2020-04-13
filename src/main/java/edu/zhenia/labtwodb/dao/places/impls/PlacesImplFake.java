package edu.zhenia.labtwodb.dao.places.impls;

import edu.zhenia.labtwodb.dao.places.interfaces.IPlacesDao;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.places.impls.PlacesServiceImpl;

import java.util.List;

public class PlacesImplFake implements IPlacesDao {
    PlacesServiceImpl service;
    @Override
    public Places save(Places Places) {
        return null;
    }

    @Override
    public Places get(String id) {
        return null;
    }

    @Override
    public List<Places> getAll() {
        return service.getAll();
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
