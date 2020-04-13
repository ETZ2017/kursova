package edu.zhenia.labtwodb.dao.artistImpressario.impls;

import edu.zhenia.labtwodb.dao.artistImpressario.interfaces.IArtistImpressarioDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.ArtistImpressario;
import edu.zhenia.labtwodb.service.artistImpressario.impls.ArtistImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistImpressarioImplFake implements IArtistImpressarioDao {
    @Autowired
    DataSet dataSet;

    @Override
    public ArtistImpressario save(ArtistImpressario artistImpressario) {
        return null;
    }

    @Override
    public ArtistImpressario get(String id) {
        return null;
    }

    @Override
    public List<ArtistImpressario> getAll() {
        return dataSet.getArtistImpressarios();
    }

    @Override
    public ArtistImpressario edit(ArtistImpressario artistInGenre) {
        return null;
    }

    @Override
    public ArtistImpressario delete(String id) {
        return null;
    }
}
