package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/artistatevent")
public class ArtistAtEventWEBController {
    @Autowired
    ArtistServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("artistAtEvents", service.getAll());
        return "artistAtEventList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("artistAtEvents", service.getAll());
        return "artistAtEventList";
    }
}
