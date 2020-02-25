package edu.zhenia.labtwodb.service.typeOfBuilding.impls;

import edu.zhenia.labtwodb.dao.typeOfBuilding.impls.TypeOfBuildingDaoImplFake;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfBuilding.interfaces.ITypeOfBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class TypeOfBuildingServiceImpl implements ITypeOfBuildingService {
    @Autowired
    TypeOfBuildingDaoImplFake dao;

    @Override
    public TypeOfBuilding save(TypeOfBuilding TypeOfBuilding) {
        return null;
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
        return null;
    }

    @Override
    public TypeOfBuilding delete(String id) {
        TypeOfBuilding typeOfBuilding = this.get(id);
        dao.getAll().remove(typeOfBuilding);
        return typeOfBuilding;
    }
}
