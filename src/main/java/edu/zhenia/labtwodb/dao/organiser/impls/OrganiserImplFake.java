package edu.zhenia.labtwodb.dao.organiser.impls;

import edu.zhenia.labtwodb.dao.organiser.interfaces.IOrganiserDao;
import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.service.organiser.impls.OrganiserServiceImpl;

import java.util.List;

public class OrganiserImplFake implements IOrganiserDao {
    OrganiserServiceImpl service;
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
        return service.getAll();
    }

    @Override
    public Organiser edit(Organiser group) {
        return null;
    }

    @Override
    public Organiser delete(String id) {
        return null;
    }
}
