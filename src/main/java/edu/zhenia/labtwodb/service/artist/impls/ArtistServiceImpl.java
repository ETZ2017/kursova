package edu.zhenia.labtwodb.service.artist.impls;

import edu.zhenia.labtwodb.dao.artist.impls.DaoImplFake;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.interfaces.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ArtistServiceImpl implements IArtistService {

    @Autowired
    DaoImplFake dao;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Artist save(Artist artist) {
        return dao.save(artist);
    }

    @Override
    public Artist get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Artist> getAll() {
        return dao.getAll();
    }

    @Override
    public Artist edit(Artist group) {
        return dao.edit(group);
    }

    @Override
    public Artist delete(String id) {
        Artist artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }


   /* @Autowired
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


        System.out.println(repository.findAll());

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
    }*/

    public List<Artist> search(String word){
        List<Artist> artists = this.getAll();
        List<Artist> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for(Artist artist : artists) {
            if(artist.getFirstName().contains(word) ||
                    artist.getFirstName().toLowerCase().contains(temp)){
                found.add(artist);
            }
        }

        return found;
    }

    public List<Artist> sortByName(List<Artist> artists){

        Collections.sort(artists, new ArtistNameComparator());

        return artists;
    }

    private class ArtistNameComparator implements Comparator<Artist> {
        public int compare(Artist p1, Artist p2) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    }
}
