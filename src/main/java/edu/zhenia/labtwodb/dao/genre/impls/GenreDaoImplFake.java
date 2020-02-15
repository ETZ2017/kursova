package edu.zhenia.labtwodb.dao.genre.impls;

import edu.zhenia.labtwodb.dao.genre.interfaces.IGenreDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenreDaoImplFake implements IGenreDao {
   @Autowired
    DataSet dataSet;

    @Override
    public Genre save(Genre Genre) {
        return null;
    }

    @Override
    public Genre get(String key) {
        return null;
    }

    @Override
    public List<Genre> getAll() {
        return dataSet.getGenres();
    }

    @Override
    public Genre edit(Genre group) {
        return null;
    }

    @Override
    public Genre delete(String id) {
        return null;
    }
}
