package edu.zhenia.labtwodb.dao.typeOfBuilding.impls;

import edu.zhenia.labtwodb.dao.typeOfBuilding.interfaces.ITypeOfBuildingDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TypeOfBuildingDaoImplFake implements ITypeOfBuildingDao {
   @Autowired
    DataSet dataSet;

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
        return dataSet.getTypeOfBuildings();
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
