package edu.zhenia.labtwodb.service.artistImpressario.interfaces;

import edu.zhenia.labtwodb.model.ArtistImpressario;
import edu.zhenia.labtwodb.model.ArtistInGenre;

import java.util.List;

public interface IArtistImpressarioService {
    ArtistImpressario save(ArtistImpressario artistImpressario);
    ArtistImpressario get(String id);
    List<ArtistImpressario> getAll();
    ArtistImpressario edit(ArtistImpressario group);
    ArtistImpressario delete(String id);
}
