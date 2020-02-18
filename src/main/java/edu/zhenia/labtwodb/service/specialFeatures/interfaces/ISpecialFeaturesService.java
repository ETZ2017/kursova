package edu.zhenia.labtwodb.service.specialFeatures.interfaces;

import edu.zhenia.labtwodb.model.SpecialFeatures;

import java.util.List;

public interface ISpecialFeaturesService {
    SpecialFeatures save(SpecialFeatures SpecialFeatures);
    SpecialFeatures get(String id);
    List<SpecialFeatures> getAll();
    SpecialFeatures edit(SpecialFeatures group);
    SpecialFeatures delete(String id);

}
