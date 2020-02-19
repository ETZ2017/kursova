package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.places.impls.PlacesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/places")
public class PlacesController {
    @Autowired
    PlacesServiceImpl service;

    @RequestMapping("/list")
    List<Places> getall(){
        return service.getAll();
    }
}
