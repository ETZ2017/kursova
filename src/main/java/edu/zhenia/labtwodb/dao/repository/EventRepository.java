package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
}
