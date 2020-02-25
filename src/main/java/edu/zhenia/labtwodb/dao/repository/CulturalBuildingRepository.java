package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.CulturalBuilding;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CulturalBuildingRepository extends MongoRepository<CulturalBuilding, String> {
}
