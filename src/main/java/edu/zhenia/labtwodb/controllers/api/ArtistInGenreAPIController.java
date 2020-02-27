package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artistAtEvent.impls.ArtistAtEventServiceImpl;
import edu.zhenia.labtwodb.service.artistInGenre.impls.ArtistInGenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
