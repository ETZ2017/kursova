package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.*;
import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.places.impls.PlacesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/places")
public class PlacesWEBController {
    @Autowired
    PlacesServiceImpl service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("placess", service.getAll());
        return "placesList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        List <Places>  list = service.search(word);
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("placess", list);
        return "placesList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Places> places = service.getAll();
        List<Places> sorted = service.sortByName(places);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("placess", sorted);
        return "placesList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("placess", service.getAll());
        return "redirect:/web/places/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        PlacesForm placesForm = new PlacesForm();
        model.addAttribute("placesForm", placesForm);
        return "placesAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("placesForm") PlacesForm placesForm) {
        Places group = new Places();
        group.setPlace(placesForm.getPlace());
        group.setDescription(placesForm.getDescription());
        service.save(group);
        model.addAttribute("placess", service.getAll());
        return "redirect:/web/places/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Places group = service.get(id);
        PlacesForm groupForm = new PlacesForm();
        groupForm.setPlace(group.getPlace());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("placesForm", groupForm);
        return "placesEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("placesForm") PlacesForm placesForm) {
        Places group = new Places();
        group.setid(id);
        group.setPlace(placesForm.getPlace());
        group.setDescription(placesForm.getDescription());
        service.edit(group);
        model.addAttribute("placess", service.getAll());
        return "redirect:/web/places/list";
    }
}
