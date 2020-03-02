package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.event.impls.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventAPIController {
    @Autowired
    EventServiceImpl service;

    @RequestMapping("/list")
    List<Event> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    Event get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    Event edit(@RequestBody Event event){
        return service.save(event);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Event create(@RequestBody Event event){
        return service.save(event);
    }

    @RequestMapping("/delete/{id}")
    Event delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
