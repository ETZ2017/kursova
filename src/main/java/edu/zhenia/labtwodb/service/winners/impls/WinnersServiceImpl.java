package edu.zhenia.labtwodb.service.winners.impls;

import edu.zhenia.labtwodb.dao.repository.WinnersRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.winners.interfaces.IWinnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WinnersServiceImpl implements IWinnersService {

    @Autowired
    WinnersRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Winners save(Winners winners) {
        winners.setDateCreated(LocalDateTime.now());
        winners.setDateModified(LocalDateTime.now());
        return repository.save(winners);
    }

    @Override
    public Winners get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Winners> getAll() {
        return repository.findAll();
    }

    @Override
    public Winners edit(Winners winners) {
        winners.setDateModified(LocalDateTime.now());
        return repository.save(winners);
    }

    @Override
    public Winners delete(String id) {
        Winners artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }
}
