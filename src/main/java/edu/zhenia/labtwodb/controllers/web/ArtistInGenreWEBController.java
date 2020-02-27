package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.service.artistAtEvent.impls.ArtistAtEventServiceImpl;
import edu.zhenia.labtwodb.service.artistInGenre.impls.ArtistInGenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/artistingenre")
public class ArtistInGenreWEBController {
    @Autowired
    ArtistInGenreServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("artistInGenres", service.getAll());
        return "artistInGenreList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("artistInGenres", service.getAll());
        return "artistInGenreList";
    }
}
