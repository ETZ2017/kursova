package edu.zhenia.labtwodb.service.genre.impls;

import edu.zhenia.labtwodb.dao.repository.GenreRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.service.genre.interfaces.IGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class GenreServiceImpl implements IGenreService {
    @Autowired
    GenreRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Genre save(Genre genre) {
        genre.setDateCreated(LocalDateTime.now());
        genre.setDateModified(LocalDateTime.now());
        return repository.save(genre);
    }

    @Override
    public Genre get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Genre> getAll() {
        return repository.findAll();
    }

    @Override
    public Genre edit(Genre genre) {
        genre.setDateModified(LocalDateTime.now());
        return repository.save(genre);
    }

    @Override
    public Genre delete(String id) {
        Genre artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }
}
