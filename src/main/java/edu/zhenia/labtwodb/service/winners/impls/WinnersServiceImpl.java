package edu.zhenia.labtwodb.service.winners.impls;

import edu.zhenia.labtwodb.dao.repository.TypeOfBuildingRepository;
import edu.zhenia.labtwodb.dao.repository.WinnersRepository;
import edu.zhenia.labtwodb.dao.winners.impls.WinnersDaoImplFake;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.winners.interfaces.IWinnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class WinnersServiceImpl implements IWinnersService {
    @Autowired
    WinnersDaoImplFake dao;

    @Autowired
    WinnersRepository repository;

    @PostConstruct
    void init(){
        List<Winners> list = dao.getAll();

        //repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public Winners edit(Winners group) {
        return null;
    }

    @Override
    public Winners delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
