package edu.zhenia.labtwodb.service.impressario.impls;

import edu.zhenia.labtwodb.dao.repository.ImpressarioRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.impressario.interfaces.IImpressarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ImpressarioServiceImpl implements IImpressarioService {

    @Autowired
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
    }
}
