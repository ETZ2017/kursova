package edu.zhenia.labtwodb.dao.specialFeatures.impls;

import edu.zhenia.labtwodb.dao.specialFeatures.interfaces.ISpecialFeaturesDao;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.service.specialFeatures.impls.SpecialFeaturesServiceImpl;

import java.util.List;

public class SpecialFeaturesImplFake implements ISpecialFeaturesDao {
    SpecialFeaturesServiceImpl service;

    @Override
    public SpecialFeatures save(SpecialFeatures SpecialFeatures) {
        return null;
    }

    @Override
    public SpecialFeatures get(String id) {
        return null;
    }

    @Override
    public List<SpecialFeatures> getAll() {
        return service.getAll();
    }

    @Override
    public SpecialFeatures edit(SpecialFeatures group) {
        return null;
    }

    @Override
    public SpecialFeatures delete(String id) {
        return null;
    }
}
