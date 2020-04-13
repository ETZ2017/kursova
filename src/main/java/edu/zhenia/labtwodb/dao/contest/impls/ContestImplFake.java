package edu.zhenia.labtwodb.dao.contest.impls;

import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import edu.zhenia.labtwodb.service.contest.interfaces.IContestService;

import java.util.List;

public class ContestImplFake implements IContestService {
    ContestServiceImpl service;

    @Override
    public Contest save(Contest Contest) {
        return null;
    }

    @Override
    public Contest get(String id) {
        return null;
    }

    @Override
    public List<Contest> getAll() {
        return service.getAll();
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
