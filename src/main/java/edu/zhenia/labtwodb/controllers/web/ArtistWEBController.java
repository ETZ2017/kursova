package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/artist")
public class ArtistWEBController {
    @Autowired
    ArtistServiceImpl service;

    @RequestMapping("/list")
    String getall(){
        return "artistList";
    }
}
