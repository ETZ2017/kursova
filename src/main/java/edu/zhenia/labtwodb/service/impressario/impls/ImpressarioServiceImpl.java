package edu.zhenia.labtwodb.service.impressario.impls;

import edu.zhenia.labtwodb.dao.genre.impls.GenreImplFake;
import edu.zhenia.labtwodb.dao.impressario.impls.ImpressarioImplFake;
import edu.zhenia.labtwodb.dao.repository.ImpressarioRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import edu.zhenia.labtwodb.service.impressario.interfaces.IImpressarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ImpressarioServiceImpl implements IImpressarioService {

    @Autowired
    ImpressarioImplFake dao;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Impressario save(Impressario artist) {
        return dao.save(artist);
    }

    @Override
    public Impressario get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Impressario> getAll() {
        return dao.getAll();
    }

    @Override
    public Impressario edit(Impressario group) {
        return dao.edit(group);
    }

    @Override
    public Impressario delete(String id) {
        Impressario artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }
    /*@Autowired
    ImpressarioRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Impressario save(Impressario impressario) {
        impressario.setDateCreated(LocalDateTime.now());
        impressario.setDateModified(LocalDateTime.now());
        return repository.save(impressario);
    }

    @Override
    public Impressario get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Impressario> getAll() {
        return repository.findAll();
    }

    @Override
    public Impressario edit(Impressario impressario) {
        impressario.setDateModified(LocalDateTime.now());
        return repository.save(impressario);
    }

    @Override
    public Impressario delete(String id) {
        Impressario artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }*/

    public List<Impressario> searchByName(String word) {
        List<Impressario> impressarios = this.getAll();
        List<Impressario> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Impressario impressario : impressarios) {
            if (impressario.getFirstName().toLowerCase().contains(temp)||
                    impressario.getFirstName().contains(word)) {
                found.add(impressario);
            }
        }

        return found;
    }

    public List<Impressario> searchByGenre(String word) {
        List<Impressario> impressarios = this.getAll();
        List<Impressario> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (Impressario impressario : impressarios) {
            if (impressario.getGenre().getGenre().toLowerCase().contains(temp)||
                    impressario.getGenre().getGenre().contains(word)) {
                found.add(impressario);
            }
        }

        return found;
    }

    public List<Impressario> sortByName(List<Impressario> impressarios){

        Collections.sort(impressarios, new ImpressarioServiceImpl.ImpressarioNameComparator());

        return impressarios;
    }

    private class ImpressarioNameComparator implements Comparator<Impressario> {
        public int compare(Impressario p1, Impressario p2) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    }
}
