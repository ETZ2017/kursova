package edu.zhenia.labtwodb.service.typeOfBuilding.impls;

import edu.zhenia.labtwodb.dao.repository.SpecialFeaturesRepository;
import edu.zhenia.labtwodb.dao.repository.TypeOfBuildingRepository;
import edu.zhenia.labtwodb.dao.typeOfBuilding.impls.TypeOfBuildingDaoImplFake;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.typeOfBuilding.interfaces.ITypeOfBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class TypeOfBuildingServiceImpl implements ITypeOfBuildingService {
    @Autowired
    TypeOfBuildingDaoImplFake dao;

    @Autowired
    TypeOfBuildingRepository repository;

    @PostConstruct
    void init(){
        List<TypeOfBuilding> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public TypeOfBuilding save(TypeOfBuilding TypeOfBuilding) {
        return null;
    }

    @Override
    public TypeOfBuilding get(String id) {
        return null;
    }

    @Override
    public List<TypeOfBuilding> getAll() {
        return repository.findAll();
    }

    @Override
    public TypeOfBuilding edit(TypeOfBuilding group) {
        return null;
    }

    @Override
    public TypeOfBuilding delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
