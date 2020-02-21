package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.places.impls.PlacesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/places")
public class PlacesWEBController {
    @Autowired
    PlacesServiceImpl service;

    @RequestMapping("/list")
    String getall(){
        return "placesList";
    }
}
