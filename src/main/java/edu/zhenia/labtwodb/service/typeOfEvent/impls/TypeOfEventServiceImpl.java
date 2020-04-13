package edu.zhenia.labtwodb.service.typeOfEvent.impls;

import edu.zhenia.labtwodb.dao.repository.TypeOfEventRepository;
import edu.zhenia.labtwodb.dao.typeOfBuilding.impls.TypeOfBuildingImplFake;
import edu.zhenia.labtwodb.dao.typeOfEvent.impls.TypeOfEventImplFake;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfBuilding.impls.TypeOfBuildingServiceImpl;
import edu.zhenia.labtwodb.service.typeOfEvent.interfaces.ITypeOfEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class TypeOfEventServiceImpl implements ITypeOfEventService {

    @Autowired
    TypeOfEventImplFake dao;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public TypeOfEvent save(TypeOfEvent artist) {
        return dao.save(artist);
    }

    @Override
    public TypeOfEvent get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<TypeOfEvent> getAll() {
        return dao.getAll();
    }

    @Override
    public TypeOfEvent edit(TypeOfEvent group) {
        return dao.edit(group);
    }

    @Override
    public TypeOfEvent delete(String id) {
        TypeOfEvent artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }

    /*@Autowired
    TypeOfEventRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public TypeOfEvent save(TypeOfEvent typeOfEvent) {
        typeOfEvent.setDateCreated(LocalDateTime.now());
        typeOfEvent.setDateModified(LocalDateTime.now());
        return repository.save(typeOfEvent);
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
    }*/

    public List<TypeOfEvent> searchByType(String word) {
        List<TypeOfEvent> typeOfEvents = this.getAll();
        List<TypeOfEvent> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (TypeOfEvent typeOfEvent : typeOfEvents) {
            if (typeOfEvent.getType().toLowerCase().contains(temp)||
                    typeOfEvent.getType().contains(word)) {
                found.add(typeOfEvent);
            }
        }

        return found;
    }

    public List<TypeOfEvent> sortByName(List<TypeOfEvent> typeOfEvents){

        Collections.sort(typeOfEvents, new TypeOfEventServiceImpl.TypeOfEventNameComparator());

        return typeOfEvents;
    }

    private class TypeOfEventNameComparator implements Comparator<TypeOfEvent> {
        public int compare(TypeOfEvent p1, TypeOfEvent p2) {
            return p1.getType().compareTo(p2.getType());
        }
    }
}
