package edu.zhenia.labtwodb.service.places.impls;

import edu.zhenia.labtwodb.dao.repository.PlacesRepository;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.places.interfaces.IPlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class PlacesServiceImpl implements IPlacesService {

    @Autowired
    PlacesRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public Places edit(Places group) {
        return null;
    }

    @Override
    public Places delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
