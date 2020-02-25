package edu.zhenia.labtwodb.service.organiser.impls;

import edu.zhenia.labtwodb.dao.organiser.impls.OrganiserDaoImplFake;
import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.organiser.interfaces.IOrganiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class OrganiserServiceImpl implements IOrganiserService {
    @Autowired
    OrganiserDaoImplFake dao;

    @Override
    public Organiser save(Organiser Organiser) {
        return null;
    }

    @Override
    public Organiser get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Organiser> getAll() {
        return dao.getAll();
    }

    @Override
    public Organiser edit(Organiser group) {
        return null;
    }

    @Override
    public Organiser delete(String id) {
        Organiser organiser = this.get(id);
        dao.getAll().remove(organiser);
        return organiser;
    }
}
