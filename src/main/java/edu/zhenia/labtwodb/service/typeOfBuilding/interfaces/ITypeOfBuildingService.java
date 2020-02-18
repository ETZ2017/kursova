package edu.zhenia.labtwodb.service.typeOfBuilding.interfaces;

        import edu.zhenia.labtwodb.model.TypeOfBuilding;

        import java.util.List;

public interface ITypeOfBuildingService {
    TypeOfBuilding save(TypeOfBuilding TypeOfBuilding);
    TypeOfBuilding get(String id);
    List<TypeOfBuilding> getAll();
    TypeOfBuilding edit(TypeOfBuilding group);
    TypeOfBuilding delete(String id);

}
