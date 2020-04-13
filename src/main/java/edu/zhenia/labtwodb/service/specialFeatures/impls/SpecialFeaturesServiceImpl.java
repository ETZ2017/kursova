package edu.zhenia.labtwodb.service.specialFeatures.impls;

import edu.zhenia.labtwodb.dao.repository.SpecialFeaturesRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.service.places.impls.PlacesServiceImpl;
import edu.zhenia.labtwodb.service.specialFeatures.interfaces.ISpecialFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class SpecialFeaturesServiceImpl implements ISpecialFeaturesService {
    @Autowired
    SpecialFeaturesRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public SpecialFeatures save(SpecialFeatures specialFeatures) {
        specialFeatures.setDateCreated(LocalDateTime.now());
        specialFeatures.setDateModified(LocalDateTime.now());
        return repository.save(specialFeatures);
    }

    @Override
    public SpecialFeatures get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<SpecialFeatures> getAll() {
        return repository.findAll();
    }

    @Override
    public SpecialFeatures edit(SpecialFeatures specialFeatures) {
        specialFeatures.setDateModified(LocalDateTime.now());
        return repository.save(specialFeatures);
    }

    @Override
    public SpecialFeatures delete(String id) {
        SpecialFeatures artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }

    public List<SpecialFeatures> searchByType(String word) {
        List<SpecialFeatures> specials = this.getAll();
        List<SpecialFeatures> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (SpecialFeatures special : specials) {
            if (special.getType().toLowerCase().contains(temp)||
                    special.getType().contains(word)) {
                found.add(special);
            }
        }

        return found;
    }

    public List<SpecialFeatures> sortByName(List<SpecialFeatures> specialFeatures){

        Collections.sort(specialFeatures, new SpecialFeaturesServiceImpl.SpecialFeaturesNameComparator());

        return specialFeatures;
    }

    private class SpecialFeaturesNameComparator implements Comparator<SpecialFeatures> {
        public int compare(SpecialFeatures p1, SpecialFeatures p2) {
            return p1.getType().compareTo(p2.getType());
        }
    }
}
