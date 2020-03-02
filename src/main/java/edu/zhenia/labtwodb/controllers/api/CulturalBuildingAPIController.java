package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.service.culturalBuilding.impls.CulturalBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/building")
public class CulturalBuildingAPIController {
    @Autowired
    CulturalBuildingServiceImpl service;

    @RequestMapping("/list")
    List<CulturalBuilding> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    CulturalBuilding get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    CulturalBuilding edit(@RequestBody CulturalBuilding culturalBuilding){
        return service.save(culturalBuilding);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    CulturalBuilding create(@RequestBody CulturalBuilding culturalBuilding){
        return service.save(culturalBuilding);
    }

    @RequestMapping("/delete/{id}")
    CulturalBuilding delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
