package edu.zhenia.labtwodb.service.artistInGenre.impls;

import edu.zhenia.labtwodb.dao.repository.ArtistInGenreRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artistAtEvent.interfaces.IArtistAtEventService;
import edu.zhenia.labtwodb.service.artistInGenre.interfaces.IArtistInGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArtistInGenreServiceImpl implements IArtistInGenreService {
    @Autowired
    ArtistInGenreRepository repository;

    @PostConstruct
    void init(){

        // repository.saveAll(list);
    }

    @Override
    public ArtistInGenre save(ArtistInGenre artistInGenre) {
        artistInGenre.setDateCreated(LocalDateTime.now());
        artistInGenre.setDateModified(LocalDateTime.now());
        return repository.save(artistInGenre);
    }

    @Override
    public ArtistInGenre get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ArtistInGenre> getAll() {
            return repository.findAll();
    }

    @Override
    public ArtistInGenre edit(ArtistInGenre artistInGenre) {
        artistInGenre.setDateModified(LocalDateTime.now());
        return repository.save(artistInGenre);
    }

    @Override
    public ArtistInGenre delete(String id) {
        ArtistInGenre artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }
}
