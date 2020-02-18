package edu.zhenia.labtwodb.service.places.impls;

import edu.zhenia.labtwodb.dao.places.impls.PlacesDaoImplFake;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.places.interfaces.IPlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacesServiceImpl implements IPlacesService {
    @Autowired
    PlacesDaoImplFake dao;

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
        return dao.getAll();
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
