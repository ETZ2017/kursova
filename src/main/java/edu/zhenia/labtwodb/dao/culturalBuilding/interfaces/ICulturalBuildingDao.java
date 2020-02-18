package edu.zhenia.labtwodb.dao.culturalBuilding.interfaces;

import edu.zhenia.labtwodb.model.CulturalBuilding;

import java.util.List;

public interface ICulturalBuildingDao {
    CulturalBuilding save(CulturalBuilding CulturalBuilding);
    CulturalBuilding get(String id);
    List<CulturalBuilding> getAll();
    CulturalBuilding edit(CulturalBuilding group);
    CulturalBuilding delete(String id);
}
