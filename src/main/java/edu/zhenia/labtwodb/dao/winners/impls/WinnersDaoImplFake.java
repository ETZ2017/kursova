package edu.zhenia.labtwodb.dao.winners.impls;

import edu.zhenia.labtwodb.dao.winners.interfaces.IWinnersDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Winners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WinnersDaoImplFake implements IWinnersDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getWinners();
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
