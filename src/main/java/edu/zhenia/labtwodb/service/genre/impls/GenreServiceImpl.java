package edu.zhenia.labtwodb.service.genre.impls;

import edu.zhenia.labtwodb.dao.genre.impls.GenreDaoImplFake;
import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.service.genre.interfaces.IGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements IGenreService {
    @Autowired
    GenreDaoImplFake dao;

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
        return dao.getAll();
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
