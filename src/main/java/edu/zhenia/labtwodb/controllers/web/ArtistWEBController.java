package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/artist")
public class ArtistWEBController {
    @Autowired
    ArtistServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("artists", service.getAll());
        return "artistList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("artists", service.getAll());
        return "artistList";
    }
}
