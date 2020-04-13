package edu.zhenia.labtwodb.dao.specialFeatures.impls;

import edu.zhenia.labtwodb.dao.specialFeatures.interfaces.ISpecialFeaturesDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.service.specialFeatures.impls.SpecialFeaturesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SpecialFeaturesImplFake implements ISpecialFeaturesDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getSpecialFeatures();
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
