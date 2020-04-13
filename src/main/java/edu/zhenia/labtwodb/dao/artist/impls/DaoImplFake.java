package edu.zhenia.labtwodb.dao.artist.impls;

import edu.zhenia.labtwodb.dao.artist.interfaces.IArtistDao;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;

import java.util.List;

public class DaoImplFake implements IArtistDao {
    ArtistServiceImpl service;

    @Override
    public Artist save(Artist artist) {
        return null;
    }

    @Override
    public Artist get(String id) {
        return null;
    }

    @Override
    public List<Artist> getAll() {
        return service.getAll();
    }

    @Override
    public Artist edit(Artist group) {
        return null;
    }

    @Override
    public Artist delete(String id) {
        return null;
    }
}
