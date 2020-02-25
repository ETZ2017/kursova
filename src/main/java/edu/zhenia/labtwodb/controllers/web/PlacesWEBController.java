package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.places.impls.PlacesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/places")
public class PlacesWEBController {
    @Autowired
    PlacesServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("placess", service.getAll());
        return "placesList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("placess", service.getAll());
        return "placesList";
    }
}
