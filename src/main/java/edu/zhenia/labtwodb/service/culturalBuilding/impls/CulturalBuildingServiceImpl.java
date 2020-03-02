package edu.zhenia.labtwodb.service.culturalBuilding.impls;

import edu.zhenia.labtwodb.dao.repository.CulturalBuildingRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.service.culturalBuilding.interfaces.ICulturalBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CulturalBuildingServiceImpl implements ICulturalBuildingService {

    @Autowired
    CulturalBuildingRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public CulturalBuilding save(CulturalBuilding culturalBuilding) {
        culturalBuilding.setDateCreated(LocalDateTime.now());
        culturalBuilding.setDateModified(LocalDateTime.now());
        return repository.save(culturalBuilding);
    }

    @Override
    public CulturalBuilding get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<CulturalBuilding> getAll() {
        return repository.findAll();
    }

    @Override
    public CulturalBuilding edit(CulturalBuilding culturalBuilding) {
        culturalBuilding.setDateModified(LocalDateTime.now());
        return repository.save(culturalBuilding);
    }

    @Override
    public CulturalBuilding delete(String id) {
        CulturalBuilding artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }
}
