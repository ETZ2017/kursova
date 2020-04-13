package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.places.impls.PlacesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/places")
public class PlacesAPIController {
    @Autowired
    PlacesServiceImpl service;

    @RequestMapping("/list")
    List<Places> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    Places get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    Places edit(@RequestBody Places places){
        return service.edit(places);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Places create(@RequestBody Places places){
        return service.save(places);
    }

    @RequestMapping("/delete/{id}")
    Places delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
