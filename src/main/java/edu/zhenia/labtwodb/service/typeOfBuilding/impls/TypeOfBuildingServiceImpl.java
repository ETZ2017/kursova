package edu.zhenia.labtwodb.service.typeOfBuilding.impls;

import edu.zhenia.labtwodb.dao.repository.TypeOfBuildingRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.typeOfBuilding.interfaces.ITypeOfBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TypeOfBuildingServiceImpl implements ITypeOfBuildingService {

    @Autowired
    TypeOfBuildingRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public TypeOfBuilding save(TypeOfBuilding typeOfBuilding) {
        typeOfBuilding.setDateCreated(LocalDateTime.now());
        typeOfBuilding.setDateModified(LocalDateTime.now());
        return typeOfBuilding;
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
    }
}
