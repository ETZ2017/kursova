package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {
//for git
    @Autowired
    ArtistServiceImpl service;

    @RequestMapping("/List")
    List<Artist> getall(){
        return service.getAll();
    }
}
