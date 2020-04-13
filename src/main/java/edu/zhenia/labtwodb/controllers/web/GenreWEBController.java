package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.EventForm;
import edu.zhenia.labtwodb.forms.GenreForm;
import edu.zhenia.labtwodb.forms.PlacesForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/genre")
public class GenreWEBController {
    @Autowired
    GenreServiceImpl service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("genres", service.getAll());
        return "genreList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        List <Genre>  list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("genres", list);
        return "genreList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Genre> genres = service.getAll();
        List<Genre> sorted = service.sortByName(genres);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("genres", sorted);
        return "genreList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("genres", service.getAll());
        return "redirect:/web/genre/list";
    }

    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        GenreForm genreForm = new GenreForm();
        model.addAttribute("genreForm", genreForm);
        return "genreAdd";
    }

    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("genreForm") GenreForm genreForm) {
        Genre group = new Genre();
        group.setGenre(genreForm.getName());
        group.setDescription(genreForm.getDescription());
        service.save(group);
        model.addAttribute("genres", service.getAll());
        return "redirect:/web/genre/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Genre group = service.get(id);
        GenreForm groupForm = new GenreForm();
        groupForm.setName(group.getGenre());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("genreForm", groupForm);
        return "genreEdit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("genreForm") GenreForm genreForm) {
        Genre group = new Genre();
        group.setid(id);
        group.setGenre(genreForm.getName());
        group.setDescription(genreForm.getDescription());
        service.edit(group);
        model.addAttribute("genres", service.getAll());
        return "redirect:/web/genre/list";
    }
}
