package edu.zhenia.labtwodb.service.artist.impls;

import edu.zhenia.labtwodb.dao.artist.impl.ArtistDaoImplFake;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.interfaces.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements IArtistService {
    @Autowired
    ArtistDaoImplFake dao;

    @Override
    public Artist save(Artist artist) {
        return null;
    }

    @Override
    public Artist get(String key) {
        return null;
    }

    @Override
    public List<Artist> getAll() {
        return dao.getAll();
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
