package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepository extends MongoRepository<Artist, String> {
}
