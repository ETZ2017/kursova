package edu.zhenia.labtwodb.service.impressario.impls;

import edu.zhenia.labtwodb.dao.impressario.impls.ImpressarioDaoImplFake;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.dao.repository.ImpressarioRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.impressario.interfaces.IImpressarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ImpressarioServiceImpl implements IImpressarioService {
    @Autowired
    ImpressarioDaoImplFake dao;

    @Autowired
    ImpressarioRepository repository;

    @PostConstruct
    void init(){
        List<Impressario> list = dao.getAll();

        //repository.saveAll(list);
    }

    @Override
    public Impressario save(Impressario Impressario) {
        return null;
    }

    @Override
    public Impressario get(String id) {
        return null;
    }

    @Override
    public List<Impressario> getAll() {
        return repository.findAll();
    }

    @Override
    public Impressario edit(Impressario group) {
        return null;
    }

    @Override
    public Impressario delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
