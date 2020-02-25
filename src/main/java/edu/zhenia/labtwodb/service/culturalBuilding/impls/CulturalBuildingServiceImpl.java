package edu.zhenia.labtwodb.service.culturalBuilding.impls;

import edu.zhenia.labtwodb.dao.culturalBuilding.impls.CulturalBuildingDaoImplFake;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.culturalBuilding.interfaces.ICulturalBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CulturalBuildingServiceImpl implements ICulturalBuildingService {
    @Autowired
    CulturalBuildingDaoImplFake dao;

    @Override
    public CulturalBuilding save(CulturalBuilding CulturalBuilding) {
        return null;
    }

    @Override
    public CulturalBuilding get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<CulturalBuilding> getAll() {
        return dao.getAll();
    }

    @Override
    public CulturalBuilding edit(CulturalBuilding group) {
        return null;
    }

    @Override
    public CulturalBuilding delete(String id) {
        CulturalBuilding culturalBuilding = this.get(id);
        dao.getAll().remove(culturalBuilding);
        return culturalBuilding;
    }
}
