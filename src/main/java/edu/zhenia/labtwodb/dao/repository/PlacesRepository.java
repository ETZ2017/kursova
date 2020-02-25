package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Places;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlacesRepository extends MongoRepository<Places, String> {
}
