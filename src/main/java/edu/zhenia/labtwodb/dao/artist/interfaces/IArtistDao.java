package edu.zhenia.labtwodb.dao.artist.interfaces;

import edu.zhenia.labtwodb.model.Artist;

import java.util.List;

public interface IArtistDao {
    Artist save(Artist artist);
    Artist get(String id);
    List<Artist> getAll();
    Artist edit(Artist group);
    Artist delete(String id);
}
