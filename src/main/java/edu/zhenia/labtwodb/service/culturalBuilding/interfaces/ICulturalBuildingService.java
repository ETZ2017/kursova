package edu.zhenia.labtwodb.service.culturalBuilding.interfaces;

import edu.zhenia.labtwodb.model.CulturalBuilding;

import java.util.List;

public interface ICulturalBuildingService {
    CulturalBuilding save(CulturalBuilding CulturalBuilding);
    CulturalBuilding get(String key);
    List<CulturalBuilding> getAll();
    CulturalBuilding edit(CulturalBuilding group);
    CulturalBuilding delete(String id);

}
