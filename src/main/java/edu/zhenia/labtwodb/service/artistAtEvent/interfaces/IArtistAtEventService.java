package edu.zhenia.labtwodb.service.artistAtEvent.interfaces;

import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;

import java.util.List;

public interface IArtistAtEventService {
    ArtistAtEvent save(ArtistAtEvent artistAtEvent);
    ArtistAtEvent get(String id);
    List<ArtistAtEvent> getAll();
    ArtistAtEvent edit(ArtistAtEvent group);
    ArtistAtEvent delete(String id);
}
