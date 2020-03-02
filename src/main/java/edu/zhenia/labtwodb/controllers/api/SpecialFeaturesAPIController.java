package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.service.specialFeatures.impls.SpecialFeaturesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specialfeatures")
public class SpecialFeaturesAPIController {
    @Autowired
    SpecialFeaturesServiceImpl service;

    @RequestMapping("/list")
    List<SpecialFeatures> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    SpecialFeatures get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    SpecialFeatures edit(@RequestBody SpecialFeatures specialFeatures){
        return service.save(specialFeatures);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    SpecialFeatures create(@RequestBody SpecialFeatures specialFeatures){
        return service.save(specialFeatures);
    }

    @RequestMapping("/delete/{id}")
    SpecialFeatures delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
