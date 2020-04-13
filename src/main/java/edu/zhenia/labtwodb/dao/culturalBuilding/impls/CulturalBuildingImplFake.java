package edu.zhenia.labtwodb.dao.culturalBuilding.impls;

import edu.zhenia.labtwodb.dao.culturalBuilding.interfaces.ICulturalBuildingDao;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.service.culturalBuilding.impls.CulturalBuildingServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CulturalBuildingImplFake implements ICulturalBuildingDao {
    CulturalBuildingServiceImpl service;

    @Override
    public CulturalBuilding save(CulturalBuilding CulturalBuilding) {
        return null;
    }

    @Override
    public CulturalBuilding get(String id) {
        return null;
    }

    @Override
    public List<CulturalBuilding> getAll() {
        return service.getAll();
    }

    @Override
    public CulturalBuilding edit(CulturalBuilding group) {
        return null;
    }

    @Override
    public CulturalBuilding delete(String id) {
        return null;
    }
}
