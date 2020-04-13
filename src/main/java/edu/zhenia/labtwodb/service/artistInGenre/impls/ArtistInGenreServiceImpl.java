package edu.zhenia.labtwodb.service.artistInGenre.impls;

import edu.zhenia.labtwodb.dao.artistImpressario.impls.ArtistImpressarioImplFake;
import edu.zhenia.labtwodb.dao.artistInGenre.impls.ArtistInGenreImplFake;
import edu.zhenia.labtwodb.dao.repository.ArtistInGenreRepository;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.dao.repository.GenreRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistImpressario;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artistAtEvent.interfaces.IArtistAtEventService;
import edu.zhenia.labtwodb.service.artistImpressario.impls.ArtistImpressarioServiceImpl;
import edu.zhenia.labtwodb.service.artistInGenre.interfaces.IArtistInGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ArtistInGenreServiceImpl implements IArtistInGenreService {
    @Autowired
    ArtistInGenreImplFake dao;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public ArtistInGenre save(ArtistInGenre artist) {
        return dao.save(artist);
    }

    @Override
    public ArtistInGenre get(String id) {
        return dao.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<ArtistInGenre> getAll() {
        return dao.getAll();
    }

    @Override
    public ArtistInGenre edit(ArtistInGenre group) {
        return dao.edit(group);
    }

    @Override
    public ArtistInGenre delete(String id) {
        ArtistInGenre artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }

    /*@Autowired
    ArtistInGenreRepository repository;

    @Autowired
    ArtistRepository repositoryArtist;

    @Autowired
    GenreRepository repositoryGenre;


    @PostConstruct
    void init(){
        *//*ArtistInGenre artistGenre = new ArtistInGenre();
        artistGenre.setArtist(repositoryArtist.findAll().get(0));
        artistGenre.setGenre(repositoryGenre.findAll().get(0));

        repository.save(artistGenre);*//*
        *//*List<ArtistAtEvent> list = new ArrayList<>(
                Arrays.asList(
                        new ArtistAtEvent(repositoryArtist.findAll().get(0), null)
                )
        )*//*
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
    }*/

    public List<ArtistInGenre> searchByArtist(String word) {
        List<ArtistInGenre> artistInGenres = this.getAll();
        List<ArtistInGenre> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (ArtistInGenre artistInGenre : artistInGenres) {
            if (artistInGenre.getArtist().getFirstName().toLowerCase().contains(temp)||
                    artistInGenre.getArtist().getFirstName().contains(word)) {
                found.add(artistInGenre);
            }
        }

        return found;
    }

    public List<ArtistInGenre> searchByGenre(String word) {
        List<ArtistInGenre> artistInGenres = this.getAll();
        List<ArtistInGenre> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (ArtistInGenre artistInGenre : artistInGenres) {
            if (artistInGenre.getGenre().getGenre().toLowerCase().contains(temp)||
                    artistInGenre.getGenre().getGenre().contains(word)) {
                found.add(artistInGenre);
            }
        }

        return found;
    }

    public List<ArtistInGenre> sortByName(List<ArtistInGenre> artists){

        Collections.sort(artists, new ArtistInGenreServiceImpl.ArtistInGenreNameComparator());

        return artists;
    }

    private class ArtistInGenreNameComparator implements Comparator<ArtistInGenre> {
        public int compare(ArtistInGenre p1, ArtistInGenre p2) {
            return p1.getArtist().getFirstName().compareTo(p2.getArtist().getFirstName());
        }
    }
}
