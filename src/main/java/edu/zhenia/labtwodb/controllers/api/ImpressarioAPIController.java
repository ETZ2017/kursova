package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/impressario")
public class ImpressarioAPIController {
    @Autowired
    ImpressarioServiceImpl service;

    @RequestMapping("/list")
    List<Impressario> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    Impressario get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    Impressario edit(@RequestBody Impressario impressario){
        return service.save(impressario);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Impressario create(@RequestBody Impressario impressario){
        return service.save(impressario);
    }

    @RequestMapping("/delete/{id}")
    Impressario delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
