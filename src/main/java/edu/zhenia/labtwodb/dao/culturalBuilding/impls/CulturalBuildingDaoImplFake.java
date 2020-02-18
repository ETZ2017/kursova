package edu.zhenia.labtwodb.dao.culturalBuilding.impls;

import edu.zhenia.labtwodb.dao.culturalBuilding.interfaces.ICulturalBuildingDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CulturalBuildingDaoImplFake implements ICulturalBuildingDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getBuildings();
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
