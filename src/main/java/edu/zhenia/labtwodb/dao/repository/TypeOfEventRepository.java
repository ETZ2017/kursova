package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.TypeOfEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TypeOfEventRepository extends MongoRepository<TypeOfEvent, String> {
}
