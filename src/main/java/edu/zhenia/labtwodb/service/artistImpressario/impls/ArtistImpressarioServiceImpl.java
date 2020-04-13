package edu.zhenia.labtwodb.service.artistImpressario.impls;

import edu.zhenia.labtwodb.dao.repository.*;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistImpressario;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.service.artistAtEvent.impls.ArtistAtEventServiceImpl;
import edu.zhenia.labtwodb.service.artistImpressario.interfaces.IArtistImpressarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ArtistImpressarioServiceImpl implements IArtistImpressarioService {
    @Autowired
    ArtistImpressarioRepository repository;

    @Autowired
    ArtistRepository repositoryArtist;

    @Autowired
    ImpressarioRepository repositoryImpressario;

    @PostConstruct
    void init(){

       /* ArtistImpressario artistImpressario = new ArtistImpressario();
        artistImpressario.setArtist(repositoryArtist.findAll().get(0));
        artistImpressario.setImpressario(repositoryImpressario.findAll().get(0));

        repository.save(artistImpressario);*/
    }

    @Override
    public ArtistImpressario save(ArtistImpressario artistImpressario) {
        artistImpressario.setDateCreated(LocalDateTime.now());
        artistImpressario.setDateModified(LocalDateTime.now());
        return repository.save(artistImpressario);
    }

    @Override
    public ArtistImpressario get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ArtistImpressario> getAll() {
        return repository.findAll();
    }

    @Override
    public ArtistImpressario edit(ArtistImpressario group) {
        group.setDateModified(LocalDateTime.now());
        return repository.save(group);
    }

    @Override
    public ArtistImpressario delete(String id) {
        ArtistImpressario artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }

    public List<ArtistImpressario> searchByArtist(String word) {
        List<ArtistImpressario> artistImpressarios = this.getAll();
        List<ArtistImpressario> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (ArtistImpressario artistImpressario : artistImpressarios) {
            if (artistImpressario.getArtist().getFirstName().toLowerCase().contains(temp)||
                    artistImpressario.getArtist().getFirstName().contains(word)) {
                found.add(artistImpressario);
            }
        }

        return found;
    }

    public List<ArtistImpressario> searchByImpressario(String word) {
        List<ArtistImpressario> artistImpressarios = this.getAll();
        List<ArtistImpressario> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (ArtistImpressario artistImpressario : artistImpressarios) {
            if (artistImpressario.getImpressario().getFirstName().toLowerCase().contains(temp)||
                    artistImpressario.getImpressario().getFirstName().contains(word)) {
                found.add(artistImpressario);
            }
        }

        return found;
    }

    public List<ArtistImpressario> sortByName(List<ArtistImpressario> artists){

        Collections.sort(artists, new ArtistImpressarioServiceImpl.ArtistImpressarioNameComparator());

        return artists;
    }

    private class ArtistImpressarioNameComparator implements Comparator<ArtistImpressario> {
        public int compare(ArtistImpressario p1, ArtistImpressario p2) {
            return p1.getArtist().getFirstName().compareTo(p2.getArtist().getFirstName());
        }
    }
}
