package edu.zhenia.labtwodb.service.contest.impls;

import edu.zhenia.labtwodb.dao.contest.impls.ContestDaoImplFake;
import edu.zhenia.labtwodb.dao.repository.ArtistRepository;
import edu.zhenia.labtwodb.dao.repository.ContestRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.service.contest.interfaces.IContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ContestServiceImpl implements IContestService {
    @Autowired
    ContestDaoImplFake dao;

    @Autowired
    ContestRepository repository;

    @PostConstruct
    void init(){
        List<Contest> list = dao.getAll();

        //repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public Contest edit(Contest group) {
        return null;
    }

    @Override
    public Contest delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
