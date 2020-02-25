package edu.zhenia.labtwodb.service.typeOfEvent.impls;

import edu.zhenia.labtwodb.dao.repository.TypeOfEventRepository;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfEvent.interfaces.ITypeOfEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class TypeOfEventServiceImpl implements ITypeOfEventService {

    @Autowired
    TypeOfEventRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public TypeOfEvent save(TypeOfEvent TypeOfEvent) {
        return null;
    }

    @Override
    public TypeOfEvent get(String id) {
        return null;
    }

    @Override
    public List<TypeOfEvent> getAll() {
        return repository.findAll();
    }

    @Override
    public TypeOfEvent edit(TypeOfEvent group) {
        return null;
    }

    @Override
    public TypeOfEvent delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
