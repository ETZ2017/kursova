package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genre")
public class GenreAPIController {
    @Autowired
    GenreServiceImpl service;

    @RequestMapping("/list")
    List<Genre> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    Genre get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    Genre edit(@RequestBody Genre genre){
        return service.edit(genre);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Genre create(@RequestBody Genre genre){
        return service.save(genre);
    }

    @RequestMapping("/delete/{id}")
    Genre delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
