package edu.zhenia.labtwodb.service.genre.impls;

import edu.zhenia.labtwodb.dao.genre.impls.GenreDaoImplFake;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.dao.repository.GenreRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.service.genre.interfaces.IGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class GenreServiceImpl implements IGenreService {
    @Autowired
    GenreDaoImplFake dao;

    @Autowired
    GenreRepository repository;

    @PostConstruct
    void init(){
        List<Genre> list = dao.getAll();

        //repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public Genre edit(Genre group) {
        return null;
    }

    @Override
    public Genre delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
