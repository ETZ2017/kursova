package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Contest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContestRepository extends MongoRepository<Contest, String> {
}
