package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenreRepository extends MongoRepository<Genre, String> {
}
