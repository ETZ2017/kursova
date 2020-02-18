package edu.zhenia.labtwodb.dao.organiser.impls;

import edu.zhenia.labtwodb.dao.organiser.interfaces.IOrganiserDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Organiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrganiserDaoImplFake implements IOrganiserDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getOrganisers();
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
