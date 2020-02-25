package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Organiser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrganiserRepository extends MongoRepository<Organiser, String> {
}
