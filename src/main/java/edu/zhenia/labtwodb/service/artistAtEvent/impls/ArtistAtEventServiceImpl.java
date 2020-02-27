package edu.zhenia.labtwodb.service.artistAtEvent.impls;

import edu.zhenia.labtwodb.dao.artist.impl.ArtistDaoImplFake;
import edu.zhenia.labtwodb.dao.artistAtEvent.impls.ArtistAtEventDaoImplFake;
import edu.zhenia.labtwodb.dao.artistAtEvent.interfaces.IArtistAtEventDao;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.service.artistAtEvent.interfaces.IArtistAtEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistAtEventServiceImpl implements IArtistAtEventService {
    @Autowired
    ArtistAtEventDaoImplFake dao;

    @Override
    public ArtistAtEvent save(ArtistAtEvent artistAtEvent) {
        return null;
    }

    @Override
    public ArtistAtEvent get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<ArtistAtEvent> getAll() {
        return dao.getAll();
    }

    @Override
    public ArtistAtEvent edit(ArtistAtEvent group) {
        return null;
    }

    @Override
    public ArtistAtEvent delete(String id) {
        ArtistAtEvent artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }
}
