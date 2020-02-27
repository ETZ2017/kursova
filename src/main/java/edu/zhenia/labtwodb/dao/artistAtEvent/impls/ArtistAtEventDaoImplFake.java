package edu.zhenia.labtwodb.dao.artistAtEvent.impls;

import edu.zhenia.labtwodb.dao.artistAtEvent.interfaces.IArtistAtEventDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistAtEventDaoImplFake implements IArtistAtEventDao {
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
    public ArtistAtEvent edit(ArtistAtEvent group) {
        return null;
    }

    @Override
    public ArtistAtEvent delete(String id) {
        return null;
    }
}
