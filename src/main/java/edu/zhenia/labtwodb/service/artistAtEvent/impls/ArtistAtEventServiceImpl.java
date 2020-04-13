package edu.zhenia.labtwodb.service.artistAtEvent.impls;

import edu.zhenia.labtwodb.dao.artistAtEvent.impls.ArtistAtEventImplFake;
import edu.zhenia.labtwodb.dao.repository.ArtistAtEventRepository;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.dao.repository.ContestRepository;
import edu.zhenia.labtwodb.dao.repository.EventRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.artistAtEvent.interfaces.IArtistAtEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class ArtistAtEventServiceImpl implements IArtistAtEventService {
    @Autowired
    ArtistAtEventImplFake dao;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public ArtistAtEvent save(ArtistAtEvent artist) {
        return dao.save(artist);
    }

    @Override
    public ArtistAtEvent get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<ArtistAtEvent> getAll() {
        return dao.getAll();
    }

    @Override
    public ArtistAtEvent edit(ArtistAtEvent group) {
        return dao.edit(group);
    }

    @Override
    public ArtistAtEvent delete(String id) {
        ArtistAtEvent artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }
    /*@Autowired
    ArtistAtEventRepository repository;

    @Autowired
    ArtistRepository repositoryArtist;

    @Autowired
    EventRepository repositoryEvent;

    @Autowired
    ContestRepository repositoryContest;

    @PostConstruct
    void init(){
        *//*ArtistAtEvent artistEvent = new ArtistAtEvent();
        artistEvent.setArtist(repositoryArtist.findAll().get(0));
        artistEvent.setEvent(repositoryEvent.findAll().get(0));
        artistEvent.setContest(repositoryContest.findAll().get(0));

        repository.save(artistEvent);*//*
        *//*List<ArtistAtEvent> list = new ArrayList<>(
                Arrays.asList(
                        new ArtistAtEvent(repositoryArtist.findAll().get(0), null)
                )
        )*//*
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
    }*/

    public List<ArtistAtEvent> searchByArtist(String word) {
        List<ArtistAtEvent> artistsAtEvents = this.getAll();
        List<ArtistAtEvent> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (ArtistAtEvent artistAtEvent : artistsAtEvents) {
            if (artistAtEvent.getArtist().getFirstName().toLowerCase().contains(temp)||
                    artistAtEvent.getArtist().getFirstName().contains(word)) {
                found.add(artistAtEvent);
            }
        }

        return found;
    }

    public List<ArtistAtEvent> searchByEvent(String word) {
        List<ArtistAtEvent> artistsAtEvents = this.getAll();
        List<ArtistAtEvent> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (ArtistAtEvent artistAtEvent : artistsAtEvents) {
            if (artistAtEvent.getEvent().getName().toLowerCase().contains(temp)||
                    artistAtEvent.getEvent().getName().contains(word)) {
                found.add(artistAtEvent);
            }
        }

        return found;
    }

    public List<ArtistAtEvent> sortByName(List<ArtistAtEvent> artists){

        Collections.sort(artists, new ArtistAtEventServiceImpl.ArtistAtEventNameComparator());

        return artists;
    }

    private class ArtistAtEventNameComparator implements Comparator<ArtistAtEvent> {
        public int compare(ArtistAtEvent p1, ArtistAtEvent p2) {
            return p1.getArtist().getFirstName().compareTo(p2.getArtist().getFirstName());
        }
    }

   /* public List<ArtistAtEvent> searchByContest(String word) {
        List<ArtistAtEvent> artistsAtEvents = this.getAll();
        List<ArtistAtEvent> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (ArtistAtEvent artistAtEvent : artistsAtEvents) {
            if (artistAtEvent.getContest().getName().toLowerCase().contains(temp)||
                    artistAtEvent.getContest().getName().contains(word)) {
                found.add(artistAtEvent);
            }
        }

        return found;
    }*/
}
