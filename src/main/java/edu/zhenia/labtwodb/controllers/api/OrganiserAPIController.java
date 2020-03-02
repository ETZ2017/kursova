package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.service.organiser.impls.OrganiserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organiser")
public class OrganiserAPIController {
    @Autowired
    OrganiserServiceImpl service;

    @RequestMapping("/list")
    List<Organiser> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    Organiser get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    Organiser edit(@RequestBody Organiser organiser){
        return service.save(organiser);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Organiser create(@RequestBody Organiser organiser){
        return service.save(organiser);
    }

    @RequestMapping("/delete/{id}")
    Organiser delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
