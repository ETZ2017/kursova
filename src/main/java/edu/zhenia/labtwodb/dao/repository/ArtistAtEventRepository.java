package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistAtEventRepository extends MongoRepository<ArtistAtEvent, String> {
}
