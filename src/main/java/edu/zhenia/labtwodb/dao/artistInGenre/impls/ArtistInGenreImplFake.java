package edu.zhenia.labtwodb.dao.artistInGenre.impls;

import edu.zhenia.labtwodb.dao.artistInGenre.interfaces.IArtistInGenreDao;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artistInGenre.impls.ArtistInGenreServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistInGenreImplFake implements IArtistInGenreDao {
    ArtistInGenreServiceImpl service;
    @Override
    public ArtistInGenre save(ArtistInGenre artistInGenre) {
        return null;
    }

    @Override
    public ArtistInGenre get(String id) {
        return null;
    }

    @Override
    public List<ArtistInGenre> getAll() {
        return service.getAll();
    }

    @Override
    public ArtistInGenre edit(ArtistInGenre artistInGenre) {
        return null;
    }

    @Override
    public ArtistInGenre delete(String id) {
        return null;
    }
}
