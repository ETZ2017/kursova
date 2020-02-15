package edu.zhenia.labtwodb.dao.typeOfBuilding.interfaces;

import edu.zhenia.labtwodb.model.TypeOfBuilding;

import java.util.List;

public interface ITypeOfBuildingDao {
    TypeOfBuilding save(TypeOfBuilding TypeOfBuilding);
    TypeOfBuilding get(String key);
    List<TypeOfBuilding> getAll();
    TypeOfBuilding edit(TypeOfBuilding group);
    TypeOfBuilding delete(String id);
}
