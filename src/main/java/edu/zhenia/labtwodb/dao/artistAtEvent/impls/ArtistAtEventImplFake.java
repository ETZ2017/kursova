package edu.zhenia.labtwodb.dao.artistAtEvent.impls;

import edu.zhenia.labtwodb.dao.artistAtEvent.interfaces.IArtistAtEventDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.service.artistAtEvent.impls.ArtistAtEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistAtEventImplFake implements IArtistAtEventDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getArtistAtEvents();
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
