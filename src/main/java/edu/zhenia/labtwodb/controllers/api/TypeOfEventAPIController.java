package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typeofevent")
public class TypeOfEventAPIController {
    @Autowired
    TypeOfEventServiceImpl service;

    @RequestMapping("/list")
    List<TypeOfEvent> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    TypeOfEvent get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    TypeOfEvent edit(@RequestBody TypeOfEvent typeOfEvent){
        return service.save(typeOfEvent);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    TypeOfEvent create(@RequestBody TypeOfEvent typeOfEvent){
        return service.save(typeOfEvent);
    }

    @RequestMapping("/delete/{id}")
    TypeOfEvent delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}