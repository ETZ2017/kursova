package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.TypeOfBuilding;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TypeOfBuildingRepository extends MongoRepository<TypeOfBuilding, String> {
}
