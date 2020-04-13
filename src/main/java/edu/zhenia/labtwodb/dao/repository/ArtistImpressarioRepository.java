package edu.zhenia.labtwodb.dao.repository;

import edu.zhenia.labtwodb.model.ArtistImpressario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistImpressarioRepository extends MongoRepository<ArtistImpressario, String> {
}
