package edu.zhenia.labtwodb.dao.contest.impls;

import edu.zhenia.labtwodb.dao.contest.interfaces.IContestDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Contest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContestDaoImplFake implements IContestDao {
   @Autowired
    DataSet dataSet;

    @Override
    public Contest save(Contest Contest) {
        return null;
    }

    @Override
    public Contest get(String key) {
        return null;
    }

    @Override
    public List<Contest> getAll() {
        return dataSet.getContests();
    }

    @Override
    public Contest edit(Contest group) {
        return null;
    }

    @Override
    public Contest delete(String id) {
        return null;
    }
}
