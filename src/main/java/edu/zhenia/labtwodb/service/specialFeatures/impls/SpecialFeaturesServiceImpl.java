package edu.zhenia.labtwodb.service.specialFeatures.impls;

import edu.zhenia.labtwodb.dao.repository.SpecialFeaturesRepository;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.service.specialFeatures.interfaces.ISpecialFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class SpecialFeaturesServiceImpl implements ISpecialFeaturesService {
    @Autowired
    SpecialFeaturesRepository repository;

    @PostConstruct
    void init(){
        //repository.saveAll(list);
    }

    @Override
    public SpecialFeatures save(SpecialFeatures SpecialFeatures) {
        return null;
    }

    @Override
    public SpecialFeatures get(String id) {
        return null;
    }

    @Override
    public List<SpecialFeatures> getAll() {
        return repository.findAll();
    }

    @Override
    public SpecialFeatures edit(SpecialFeatures group) {
        return null;
    }

    @Override
    public SpecialFeatures delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}
