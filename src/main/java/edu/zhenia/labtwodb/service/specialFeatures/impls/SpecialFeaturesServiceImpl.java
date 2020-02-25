package edu.zhenia.labtwodb.service.specialFeatures.impls;

import edu.zhenia.labtwodb.dao.specialFeatures.impls.SpecialFeaturesDaoImplFake;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.specialFeatures.interfaces.ISpecialFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class SpecialFeaturesServiceImpl implements ISpecialFeaturesService {
    @Autowired
    SpecialFeaturesDaoImplFake dao;

    @Override
    public SpecialFeatures save(SpecialFeatures SpecialFeatures) {
        return null;
    }

    @Override
    public SpecialFeatures get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<SpecialFeatures> getAll()  {
        return dao.getAll();
    }

    @Override
    public SpecialFeatures edit(SpecialFeatures group) {
        return null;
    }

    @Override
    public SpecialFeatures delete(String id) {
        SpecialFeatures specialFeatures = this.get(id);
        dao.getAll().remove(specialFeatures);
        return specialFeatures;
    }
}
