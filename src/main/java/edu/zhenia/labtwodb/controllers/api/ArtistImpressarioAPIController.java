package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.ArtistImpressario;
import edu.zhenia.labtwodb.service.artistImpressario.impls.ArtistImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artistimpressario")
public class ArtistImpressarioAPIController {
    @Autowired
    ArtistImpressarioServiceImpl service;

    @RequestMapping("/list")
    List<ArtistImpressario> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    ArtistImpressario get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    ArtistImpressario edit(@RequestBody ArtistImpressario artist){
        return service.edit(artist);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ArtistImpressario create(@RequestBody ArtistImpressario artist){
        return service.save(artist);
    }

    @RequestMapping("/delete/{id}")
    ArtistImpressario delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
