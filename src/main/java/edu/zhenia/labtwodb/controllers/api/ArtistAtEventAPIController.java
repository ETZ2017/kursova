package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.artistAtEvent.impls.ArtistAtEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artistatevent")
public class ArtistAtEventAPIController {
    @Autowired
    ArtistAtEventServiceImpl service;

    @RequestMapping("/list")
    List<ArtistAtEvent> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    ArtistAtEvent get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    ArtistAtEvent edit(@RequestBody ArtistAtEvent artist){
        return service.save(artist);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ArtistAtEvent create(@RequestBody ArtistAtEvent artist){
        return service.save(artist);
    }

    @RequestMapping("/delete/{id}")
    ArtistAtEvent delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
