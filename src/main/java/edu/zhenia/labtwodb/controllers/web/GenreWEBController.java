package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/genre")
public class GenreWEBController {
    @Autowired
    GenreServiceImpl service;

    @RequestMapping("/list")
    String getall(){
        return "genreList";
    }
}
