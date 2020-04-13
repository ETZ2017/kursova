package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artist")
public class ArtistAPIController {
    @Autowired
    ArtistServiceImpl service;

    @RequestMapping("/list")
    List<Artist> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    Artist get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping("/delete/{id}")
    Artist delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Artist create(@RequestBody Artist artist){
        return service.save(artist);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    Artist edit(@RequestBody Artist artist){
        return service.edit(artist);
    }

}
