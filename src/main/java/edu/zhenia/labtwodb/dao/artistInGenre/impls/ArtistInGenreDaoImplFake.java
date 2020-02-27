package edu.zhenia.labtwodb.dao.artistInGenre.impls;

import edu.zhenia.labtwodb.dao.artistAtEvent.interfaces.IArtistAtEventDao;
import edu.zhenia.labtwodb.dao.artistInGenre.interfaces.IArtistInGenreDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistInGenreDaoImplFake implements IArtistInGenreDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getArtistInGenres();
    }

    @Override
    public ArtistInGenre edit(ArtistInGenre group) {
        return null;
    }

    @Override
    public ArtistInGenre delete(String id) {
        return null;
    }
}
