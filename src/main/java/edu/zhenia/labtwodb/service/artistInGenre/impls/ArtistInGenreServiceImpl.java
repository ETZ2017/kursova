package edu.zhenia.labtwodb.service.artistInGenre.impls;

import edu.zhenia.labtwodb.dao.artist.impl.ArtistDaoImplFake;
import edu.zhenia.labtwodb.dao.artistAtEvent.impls.ArtistAtEventDaoImplFake;
import edu.zhenia.labtwodb.dao.artistAtEvent.interfaces.IArtistAtEventDao;
import edu.zhenia.labtwodb.dao.artistInGenre.impls.ArtistInGenreDaoImplFake;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artistAtEvent.interfaces.IArtistAtEventService;
import edu.zhenia.labtwodb.service.artistInGenre.interfaces.IArtistInGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistInGenreServiceImpl implements IArtistInGenreService {
    @Autowired
    ArtistInGenreDaoImplFake dao;

    @Override
    public ArtistInGenre save(ArtistInGenre artistAtEvent) {
        return null;
    }

    @Override
    public ArtistInGenre get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<ArtistInGenre> getAll() {
        return dao.getAll();
    }

    @Override
    public ArtistInGenre edit(ArtistInGenre group) {
        return null;
    }

    @Override
    public ArtistInGenre delete(String id) {
        ArtistInGenre artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }
}
