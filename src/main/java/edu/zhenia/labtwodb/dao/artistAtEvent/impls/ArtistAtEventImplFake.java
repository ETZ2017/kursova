package edu.zhenia.labtwodb.dao.artistAtEvent.impls;

import edu.zhenia.labtwodb.dao.artistAtEvent.interfaces.IArtistAtEventDao;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.service.artistAtEvent.impls.ArtistAtEventServiceImpl;

import java.util.List;

public class ArtistAtEventImplFake implements IArtistAtEventDao {
    ArtistAtEventServiceImpl service;
    @Override
    public ArtistAtEvent save(ArtistAtEvent artistAtEvent) {
        return null;
    }

    @Override
    public ArtistAtEvent get(String id) {
        return null;
    }

    @Override
    public List<ArtistAtEvent> getAll() {
        return service.getAll();
    }

    @Override
    public ArtistAtEvent edit(ArtistAtEvent artistInGenre) {
        return null;
    }

    @Override
    public ArtistAtEvent delete(String id) {
        return null;
    }
}
