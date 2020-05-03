package edu.zhenia.labtwodb.dao.artist.impls;

import edu.zhenia.labtwodb.dao.artist.interfaces.IArtistDao;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DaoImplFake implements IArtistDao {
    @Autowired
    DataSet dataSet;

//    @Autowired
//    ArtistRepository repository;

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
        return dataSet.getArtists();
    }

    @Override
    public Artist edit(Artist group) {
        return null;
    }

    @Override
    public Artist delete(String id) {
        return null;
    }

/*   @PostConstruct
    void init(){
        repository.deleteAll();
        repository.saveAll(dataSet.getArtists());
    }

    @Override
    public Artist save(Artist artist) {

        int recentID = repository.findAll().stream().mapToInt(item -> Integer.parseInt(item.getid()))
                .boxed().max(Integer::compareTo).orElse(1);
        artist.setid(Integer.toString(recentID+1));

        List<Integer> list = repository.findAll().stream().mapToInt(item -> Integer.parseInt(item.getid()))
                .boxed().collect(Collectors.toList());

        return repository.save(artist);
    }

    @Override
    public Artist get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Artist> getAll() {
        return dataSet.getArtists();
    }

    @Override
    public Artist edit(Artist group) {
        return repository.save(group);
    }

    @Override
    public Artist delete(String id) {
        Artist artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }

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

        Collections.sort(artists, new DaoImplFake.ArtistNameComparator());

        return artists;
    }

    private class ArtistNameComparator implements Comparator<Artist> {
        public int compare(Artist p1, Artist p2) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    }*/
}
