package edu.zhenia.labtwodb.dao.genre.impls;

import edu.zhenia.labtwodb.dao.genre.interfaces.IGenreDao;
import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;

import java.util.List;

public class GenreImplFake implements IGenreDao {
    GenreServiceImpl service;
    @Override
    public Genre save(Genre Genre) {
        return null;
    }

    @Override
    public Genre get(String id) {
        return null;
    }

    @Override
    public List<Genre> getAll() {
        return service.getAll();
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
