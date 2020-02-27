package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.artistAtEvent.impls.ArtistAtEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/artistatevent")
public class ArtistAtEventsAPIController {
    @Autowired
    ArtistAtEventServiceImpl service;

    @RequestMapping("/list")
    List<ArtistAtEvent> getall(){
        return service.getAll();
    }
}
