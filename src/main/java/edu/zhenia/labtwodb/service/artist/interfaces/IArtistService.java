package edu.zhenia.labtwodb.service.artist.interfaces;

import edu.zhenia.labtwodb.model.Artist;

import java.util.List;

public interface IArtistService {
    Artist save(Artist artist);
    Artist get(String key);
    List<Artist> getAll();
    Artist edit(Artist group);
    Artist delete(String id);

}
