package edu.zhenia.labtwodb.service.typeOfEvent.impls;

import edu.zhenia.labtwodb.dao.repository.TypeOfEventRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfEvent.interfaces.ITypeOfEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TypeOfEventServiceImpl implements ITypeOfEventService {

    @Autowired
    TypeOfEventRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public TypeOfEvent save(TypeOfEvent typeOfEvent) {
        typeOfEvent.setDateCreated(LocalDateTime.now());
        typeOfEvent.setDateModified(LocalDateTime.now());
        return typeOfEvent;
    }

    @Override
    public TypeOfEvent get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<TypeOfEvent> getAll() {
        return repository.findAll();
    }

    @Override
    public TypeOfEvent edit(TypeOfEvent typeOfEvent) {
        typeOfEvent.setDateModified(LocalDateTime.now());
        return repository.save(typeOfEvent);
    }

    @Override
    public TypeOfEvent delete(String id) {
        TypeOfEvent artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }
}
