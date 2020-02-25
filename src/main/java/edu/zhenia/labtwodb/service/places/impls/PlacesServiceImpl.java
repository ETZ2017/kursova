package edu.zhenia.labtwodb.service.places.impls;

import edu.zhenia.labtwodb.dao.places.impls.PlacesDaoImplFake;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.service.places.interfaces.IPlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
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
        Places places = this.get(id);
        dao.getAll().remove(places);
        return places;
    }
}
