package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.Impressario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImpressarioRepository extends MongoRepository<Impressario, String> {
}
