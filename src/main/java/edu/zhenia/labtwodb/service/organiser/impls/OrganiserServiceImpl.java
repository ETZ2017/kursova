package edu.zhenia.labtwodb.service.organiser.impls;

import edu.zhenia.labtwodb.dao.repository.OrganiserRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;
import edu.zhenia.labtwodb.service.organiser.interfaces.IOrganiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class OrganiserServiceImpl implements IOrganiserService {

    @Autowired
    OrganiserRepository repository;

    @PostConstruct
    void init(){ ;

        //repository.saveAll(list);
    }

    @Override
    public Organiser save(Organiser organiser) {
        organiser.setDateCreated(LocalDateTime.now());
        organiser.setDateModified(LocalDateTime.now());
        return repository.save(organiser);
    }

    @Override
    public Organiser get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Organiser> getAll() {
        return repository.findAll();
    }

    @Override
    public Organiser edit(Organiser organiser) {
        organiser.setDateModified(LocalDateTime.now());
        return repository.save(organiser);
    }

    @Override
    public Organiser delete(String id) {
        Organiser artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }

    public List<Organiser> search(String word){
        List<Organiser> organisers = this.getAll();
        List<Organiser> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for(Organiser organiser : organisers) {
            if(organiser.getFirstName().contains(word) ||
                    organiser.getFirstName().toLowerCase().contains(temp)){
                found.add(organiser);
            }
        }

        return found;
    }

    public List<Organiser> sortByName(List<Organiser> organisers){

        Collections.sort(organisers, new OrganiserServiceImpl.OrganiserNameComparator());

        return organisers;
    }

    private class OrganiserNameComparator implements Comparator<Organiser> {
        public int compare(Organiser p1, Organiser p2) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    }
}
