package edu.zhenia.labtwodb.service.artist.impls;

import edu.zhenia.labtwodb.dao.artist.impl.ArtistDaoImplFake;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.interfaces.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ArtistServiceImpl implements IArtistService {
    @Autowired
    ArtistDaoImplFake dao;

    @Autowired
    ArtistRepository repository;

    @PostConstruct
    void init(){
        List<Artist> list = dao.getAll();

      // repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public Artist edit(Artist group) {
        return null;
    }

    @Override
    public Artist delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
