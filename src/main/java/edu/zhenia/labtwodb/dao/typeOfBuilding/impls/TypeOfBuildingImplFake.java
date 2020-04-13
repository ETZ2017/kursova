package edu.zhenia.labtwodb.dao.typeOfBuilding.impls;

import edu.zhenia.labtwodb.dao.typeOfBuilding.interfaces.ITypeOfBuildingDao;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.typeOfBuilding.impls.TypeOfBuildingServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TypeOfBuildingImplFake implements ITypeOfBuildingDao {
    TypeOfBuildingServiceImpl service;
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
        return service.getAll();
    }

    @Override
    public TypeOfBuilding edit(TypeOfBuilding group) {
        return null;
    }

    @Override
    public TypeOfBuilding delete(String id) {
        return null;
    }
}
