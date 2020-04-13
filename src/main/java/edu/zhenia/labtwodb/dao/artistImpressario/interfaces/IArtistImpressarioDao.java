package edu.zhenia.labtwodb.dao.artistImpressario.interfaces;

import edu.zhenia.labtwodb.model.ArtistImpressario;

import java.util.List;

public interface IArtistImpressarioDao {
    ArtistImpressario save(ArtistImpressario artistImpressario);
    ArtistImpressario get(String id);
    List<ArtistImpressario> getAll();
    ArtistImpressario edit(ArtistImpressario artistInGenre);
    ArtistImpressario delete(String id);
}
