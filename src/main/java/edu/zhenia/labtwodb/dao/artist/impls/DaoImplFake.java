package edu.zhenia.labtwodb.dao.artist.impls;

import edu.zhenia.labtwodb.dao.artist.interfaces.IArtistDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoImplFake implements IArtistDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getArtists();
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
