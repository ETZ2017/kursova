package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
