package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.SpecialFeatures;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpecialFeaturesRepository extends MongoRepository<SpecialFeatures, String> {
}
