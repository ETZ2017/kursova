package edu.zhenia.labtwodb.dao.artistAtEvent.interfaces;


import edu.zhenia.labtwodb.model.ArtistAtEvent;

import java.util.List;

public interface IArtistAtEventDao {
    ArtistAtEvent save(ArtistAtEvent artistAtEvent);
    ArtistAtEvent get(String id);
    List<ArtistAtEvent> getAll();
    ArtistAtEvent edit(ArtistAtEvent artistInGenre);
    ArtistAtEvent delete(String id);
}