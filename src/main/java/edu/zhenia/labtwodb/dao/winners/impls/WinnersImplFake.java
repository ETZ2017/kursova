package edu.zhenia.labtwodb.dao.winners.impls;

import edu.zhenia.labtwodb.dao.winners.interfaces.IWinnersDao;
import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.winners.impls.WinnersServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class WinnersImplFake implements IWinnersDao {
    WinnersServiceImpl service;
    @Override
    public Winners save(Winners Winners) {
        return null;
    }

    @Override
    public Winners get(String id) {
        return null;
    }

    @Override
    public List<Winners> getAll() {
        return service.getAll();
    }

    @Override
    public Winners edit(Winners group) {
        return null;
    }

    @Override
    public Winners delete(String id) {
        return null;
    }
}
