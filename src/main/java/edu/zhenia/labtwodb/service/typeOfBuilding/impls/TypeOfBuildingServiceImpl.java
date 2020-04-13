package edu.zhenia.labtwodb.service.typeOfBuilding.impls;

import edu.zhenia.labtwodb.dao.repository.TypeOfBuildingRepository;
import edu.zhenia.labtwodb.dao.specialFeatures.impls.SpecialFeaturesImplFake;
import edu.zhenia.labtwodb.dao.typeOfBuilding.impls.TypeOfBuildingImplFake;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.specialFeatures.impls.SpecialFeaturesServiceImpl;
import edu.zhenia.labtwodb.service.typeOfBuilding.interfaces.ITypeOfBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class TypeOfBuildingServiceImpl implements ITypeOfBuildingService {

    @Autowired
    TypeOfBuildingImplFake dao;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public TypeOfBuilding save(TypeOfBuilding artist) {
        return dao.save(artist);
    }

    @Override
    public TypeOfBuilding get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<TypeOfBuilding> getAll() {
        return dao.getAll();
    }

    @Override
    public TypeOfBuilding edit(TypeOfBuilding group) {
        return dao.edit(group);
    }

    @Override
    public TypeOfBuilding delete(String id) {
        TypeOfBuilding artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }
    /*@Autowired
    TypeOfBuildingRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public TypeOfBuilding save(TypeOfBuilding typeOfBuilding) {
        typeOfBuilding.setDateCreated(LocalDateTime.now());
        typeOfBuilding.setDateModified(LocalDateTime.now());
        return repository.save(typeOfBuilding);
    }

    @Override
    public TypeOfBuilding get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<TypeOfBuilding> getAll() {
        return repository.findAll();
    }

    @Override
    public TypeOfBuilding edit(TypeOfBuilding typeOfBuilding) {
        typeOfBuilding.setDateModified(LocalDateTime.now());
        return repository.save(typeOfBuilding);
    }

    @Override
    public TypeOfBuilding delete(String id) {
        TypeOfBuilding artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }*/

    public List<TypeOfBuilding> searchByType(String word) {
        List<TypeOfBuilding> typeOfBuildings = this.getAll();
        List<TypeOfBuilding> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (TypeOfBuilding typeOfBuilding : typeOfBuildings) {
            if (typeOfBuilding.getType().toLowerCase().contains(temp)||
                    typeOfBuilding.getType().contains(word)) {
                found.add(typeOfBuilding);
            }
        }

        return found;
    }

    public List<TypeOfBuilding> sortByName(List<TypeOfBuilding> typeOfBuildings){

        Collections.sort(typeOfBuildings, new TypeOfBuildingServiceImpl.TypeOfBuildingNameComparator());

        return typeOfBuildings;
    }

    private class TypeOfBuildingNameComparator implements Comparator<TypeOfBuilding> {
        public int compare(TypeOfBuilding p1, TypeOfBuilding p2) {
            return p1.getType().compareTo(p2.getType());
        }
    }
}
