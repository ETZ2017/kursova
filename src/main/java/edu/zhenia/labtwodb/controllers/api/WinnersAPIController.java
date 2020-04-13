package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.winners.impls.WinnersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/winners")
public class WinnersAPIController {
    @Autowired
    WinnersServiceImpl service;

    @RequestMapping("/list")
    List<Winners> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    Winners get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    Winners edit(@RequestBody Winners winners){
        return service.edit(winners);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Winners create(@RequestBody Winners winners){
        return service.save(winners);
    }

    @RequestMapping("/delete/{id}")
    Winners delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}