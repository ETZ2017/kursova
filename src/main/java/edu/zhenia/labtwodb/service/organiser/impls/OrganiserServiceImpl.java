package edu.zhenia.labtwodb.service.organiser.impls;

import edu.zhenia.labtwodb.dao.repository.OrganiserRepository;
import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.service.organiser.interfaces.IOrganiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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
    public Organiser save(Organiser Organiser) {
        return null;
    }

    @Override
    public Organiser get(String id) {
        return null;
    }

    @Override
    public List<Organiser> getAll() {
        return repository.findAll();
    }

    @Override
    public Organiser edit(Organiser group) {
        return null;
    }

    @Override
    public Organiser delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
