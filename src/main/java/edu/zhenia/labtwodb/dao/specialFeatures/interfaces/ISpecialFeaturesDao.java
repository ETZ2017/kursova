package edu.zhenia.labtwodb.dao.specialFeatures.interfaces;

import edu.zhenia.labtwodb.model.SpecialFeatures;

import java.util.List;

public interface ISpecialFeaturesDao {
    SpecialFeatures save(SpecialFeatures SpecialFeatures);
    SpecialFeatures get(String id);
    List<SpecialFeatures> getAll();
    SpecialFeatures edit(SpecialFeatures group);
    SpecialFeatures delete(String id);
}
