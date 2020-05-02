package edu.zhenia.labtwodb.service.culturalBuilding.impls;

import edu.zhenia.labtwodb.dao.contest.impls.ContestImplFake;
import edu.zhenia.labtwodb.dao.culturalBuilding.impls.CulturalBuildingImplFake;
import edu.zhenia.labtwodb.dao.repository.CulturalBuildingRepository;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import edu.zhenia.labtwodb.service.culturalBuilding.interfaces.ICulturalBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class CulturalBuildingServiceImpl implements ICulturalBuildingService {

    @Autowired
    CulturalBuildingImplFake dao;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public CulturalBuilding save(CulturalBuilding artist) {
        return dao.save(artist);
    }

    @Override
    public CulturalBuilding get(String id) {
        return dao.getAll().stream().filter(item -> item.getid().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<CulturalBuilding> getAll() {
        return dao.getAll();
    }

    @Override
    public CulturalBuilding edit(CulturalBuilding group) {
        return dao.edit(group);
    }

    @Override
    public CulturalBuilding delete(String id) {
        CulturalBuilding artist = this.get(id);
        dao.getAll().remove(artist);
        return artist;
    }

    /*@Autowired
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
    }*/

    public List<CulturalBuilding> searchByType(String word) {
        List<CulturalBuilding> culturalBuildings = this.getAll();
        List<CulturalBuilding> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (CulturalBuilding culturalBuilding : culturalBuildings) {
            if (culturalBuilding.getType().getType().toLowerCase().contains(temp)||
                    culturalBuilding.getType().getType().contains(word)) {
                found.add(culturalBuilding);
            }
        }

        return found;
    }

    public List<CulturalBuilding> searchBySpecials(String word, String word2) {
        List<CulturalBuilding> culturalBuildings = this.getAll();
        List<CulturalBuilding> found = new ArrayList<>();

        String temp = word.toLowerCase();
        String temp2 = word2.toLowerCase();

        for (CulturalBuilding culturalBuilding : culturalBuildings) {
            if ((culturalBuilding.getSpecials().getType().toLowerCase().contains(temp)||
                    culturalBuilding.getSpecials().getType().contains(word)) &&
                    (culturalBuilding.getValue().toLowerCase().contains(temp2)||
                            culturalBuilding.getValue().contains(temp2))) {
                found.add(culturalBuilding);
            }
        }

        return found;
    }

    public List<CulturalBuilding> searchByName(String word) {
        List<CulturalBuilding> culturalBuildings = this.getAll();
        List<CulturalBuilding> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for (CulturalBuilding culturalBuilding : culturalBuildings) {
            if (culturalBuilding.getName().toLowerCase().contains(temp)||
                    culturalBuilding.getName().contains(word)) {
                found.add(culturalBuilding);
            }
        }

        return found;
    }

    public List<CulturalBuilding> sortByName(List<CulturalBuilding> buildings){

        Collections.sort(buildings, new CulturalBuildingServiceImpl.BuildingNameComparator());

        return buildings;
    }

    private class BuildingNameComparator implements Comparator<CulturalBuilding> {
        public int compare(CulturalBuilding p1, CulturalBuilding p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
