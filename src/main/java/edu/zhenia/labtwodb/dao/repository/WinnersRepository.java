package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Winners;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WinnersRepository extends MongoRepository<Winners, String> {
}
