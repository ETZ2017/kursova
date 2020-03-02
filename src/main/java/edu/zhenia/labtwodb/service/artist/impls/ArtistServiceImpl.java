package edu.zhenia.labtwodb.service.artist.impls;

import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.interfaces.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArtistServiceImpl implements IArtistService {

    @Autowired
    ArtistRepository repository;

    @PostConstruct
    void init(){

      // repository.saveAll(list);
    }

    @Override
    public Artist save(Artist artist) {
        artist.setDateCreated(LocalDateTime.now());
        artist.setDateModified(LocalDateTime.now());
        return repository.save(artist);
    }

    @Override
    public Artist get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Artist> getAll() {
        return repository.findAll();
    }

    @Override
    public Artist edit(Artist artist) {
        artist.setDateModified(LocalDateTime.now());
        return repository.save(artist);
    }

    @Override
    public Artist delete(String id) {
        Artist artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }
}
