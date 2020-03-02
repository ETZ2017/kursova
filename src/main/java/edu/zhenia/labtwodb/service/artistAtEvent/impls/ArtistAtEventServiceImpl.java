package edu.zhenia.labtwodb.service.artistAtEvent.impls;

import edu.zhenia.labtwodb.dao.repository.ArtistAtEventRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artistAtEvent.interfaces.IArtistAtEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArtistAtEventServiceImpl implements IArtistAtEventService {
    @Autowired
    ArtistAtEventRepository repository;

    @PostConstruct
    void init(){

        // repository.saveAll(list);
    }


    @Override
    public ArtistAtEvent save(ArtistAtEvent artistAtEvent) {
        artistAtEvent.setDateCreated(LocalDateTime.now());
        artistAtEvent.setDateModified(LocalDateTime.now());
        return repository.save(artistAtEvent);
    }

    @Override
    public ArtistAtEvent get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ArtistAtEvent> getAll() {
        return repository.findAll();
    }

    @Override
    public ArtistAtEvent edit(ArtistAtEvent artistAtEvent) {
        artistAtEvent.setDateModified(LocalDateTime.now());
        return repository.save(artistAtEvent);
    }

    @Override
    public ArtistAtEvent delete(String id) {
        ArtistAtEvent artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }
}
