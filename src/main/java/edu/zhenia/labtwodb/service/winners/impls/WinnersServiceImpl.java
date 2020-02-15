package edu.zhenia.labtwodb.service.winners.impls;

import edu.zhenia.labtwodb.dao.winners.impls.WinnersDaoImplFake;
import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.winners.interfaces.IWinnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WinnersServiceImpl implements IWinnersService {
    @Autowired
    WinnersDaoImplFake dao;

    @Override
    public Winners save(Winners Winners) {
        return null;
    }

    @Override
    public Winners get(String key) {
        return null;
    }

    @Override
    public List<Winners> getAll() {
        return dao.getAll();
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
