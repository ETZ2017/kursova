package edu.zhenia.labtwodb.service.winners.impls;

import edu.zhenia.labtwodb.dao.repository.WinnersRepository;
import edu.zhenia.labtwodb.dao.typeOfEvent.impls.TypeOfEventImplFake;
import edu.zhenia.labtwodb.dao.winners.impls.WinnersImplFake;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;
import edu.zhenia.labtwodb.service.winners.interfaces.IWinnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class WinnersServiceImpl implements IWinnersService {

    @Autowired
    WinnersImplFake dao;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Winners save(Winners artist) {
        return dao.save(artist);
    }

    @Override
    public Winners get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Winners> getAll() {
        return dao.getAll();
    }

    @Override
    public Winners edit(Winners group) {
        return dao.edit(group);
    }

    @Override
    public Winners delete(String id) {
        Winners artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }

    /*@Autowired
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
    }*/

    public List<Winners> searchByArtist(String word) {
        List<Winners> winners = this.getAll();
        List<Winners> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Winners winner : winners) {
            if (winner.getArtist().getFirstName().toLowerCase().contains(temp)||
                    winner.getArtist().getFirstName().contains(word)) {
                found.add(winner);
            }
        }

        return found;
    }

    public List<Winners> searchByContest(String word) {
        List<Winners> winners = this.getAll();
        List<Winners> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Winners winner : winners) {
            if (winner.getContest().getName().toLowerCase().contains(temp)||
                    winner.getContest().getName().contains(word)) {
                found.add(winner);
            }
        }

        return found;
    }

    public List<Winners> searchByPlace(String word) {
        List<Winners> winners = this.getAll();
        List<Winners> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Winners winner : winners) {
            if (winner.getPlace().getPlace().toLowerCase().contains(temp)||
                    winner.getPlace().getPlace().contains(word)) {
                found.add(winner);
            }
        }

        return found;
    }

    public List<Winners> sortByName(List<Winners> winners){

        Collections.sort(winners, new WinnersServiceImpl.WinnersNameComparator());

        return winners;
    }

    private class WinnersNameComparator implements Comparator<Winners> {
        public int compare(Winners p1, Winners p2) {
            return p1.getArtist().getFirstName().compareTo(p2.getArtist().getFirstName());
        }
    }
}
