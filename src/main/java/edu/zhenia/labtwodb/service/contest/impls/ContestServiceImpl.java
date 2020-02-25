package edu.zhenia.labtwodb.service.contest.impls;

import edu.zhenia.labtwodb.dao.contest.impls.ContestDaoImplFake;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.service.contest.interfaces.IContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ContestServiceImpl implements IContestService {
    @Autowired
    ContestDaoImplFake dao;

    @Override
    public Contest save(Contest Contest) {
        return null;
    }

    @Override
    public Contest get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Contest> getAll() {
        return dao.getAll();
    }

    @Override
    public Contest edit(Contest group) {
        return null;
    }

    @Override
    public Contest delete(String id) {
        Contest contest = this.get(id);
        dao.getAll().remove(contest);
        return contest;
    }
}
