package edu.zhenia.labtwodb.service.places.impls;

import edu.zhenia.labtwodb.dao.repository.PlacesRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.organiser.impls.OrganiserServiceImpl;
import edu.zhenia.labtwodb.service.places.interfaces.IPlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class PlacesServiceImpl implements IPlacesService {

    @Autowired
    PlacesRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Places save(Places places) {
        places.setDateCreated(LocalDateTime.now());
        places.setDateModified(LocalDateTime.now());
        return repository.save(places);
    }

    @Override
    public Places get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Places> getAll() {
        return repository.findAll();
    }

    @Override
    public Places edit(Places places) {
        places.setDateModified(LocalDateTime.now());
        return repository.save(places);
    }

    @Override
    public Places delete(String id) {
        Places artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }

    public List<Places> search(String word){
        List<Places> placess = this.getAll();
        List<Places> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for(Places places : placess) {
            if(places.getPlace().contains(word) ||
                    places.getPlace().toLowerCase().contains(temp)){
                found.add(places);
            }
        }

        return found;
    }

    public List<Places> sortByName(List<Places> places){

        Collections.sort(places, new PlacesServiceImpl.PlacesNameComparator());

        return places;
    }

    private class PlacesNameComparator implements Comparator<Places> {
        public int compare(Places p1, Places p2) {
            return p1.getPlace().compareTo(p2.getPlace());
        }
    }
}
