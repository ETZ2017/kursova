package edu.zhenia.labtwodb.service.artistAtEvent.impls;

import edu.zhenia.labtwodb.dao.repository.ArtistAtEventRepository;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.service.artistAtEvent.interfaces.IArtistAtEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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
        return null;
    }

    @Override
    public ArtistAtEvent get(String id) {
        return null;
    }

    @Override
    public List<ArtistAtEvent> getAll() {
        return repository.findAll();
    }

    @Override
    public ArtistAtEvent edit(ArtistAtEvent group) {
        return null;
    }

    @Override
    public ArtistAtEvent delete(String id) {
        return null;
    }
}
