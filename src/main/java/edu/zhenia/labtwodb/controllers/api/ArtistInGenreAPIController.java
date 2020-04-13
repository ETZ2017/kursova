package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artistInGenre.impls.ArtistInGenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artistingenre")
public class ArtistInGenreAPIController {
    @Autowired
    ArtistInGenreServiceImpl service;

    @RequestMapping("/list")
    List<ArtistInGenre> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    ArtistInGenre get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    ArtistInGenre edit(@RequestBody ArtistInGenre artist){
        return service.edit(artist);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ArtistInGenre create(@RequestBody ArtistInGenre artist){
        return service.save(artist);
    }

    @RequestMapping("/delete/{id}")
    ArtistInGenre delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
