package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.GenreForm;
import edu.zhenia.labtwodb.forms.ImpressarioForm;
import edu.zhenia.labtwodb.forms.OrganiserForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/impressario")
public class ImpressarioWEBController {
    @Autowired
    ImpressarioServiceImpl service;

    @Autowired
    GenreServiceImpl genreService;

    @Autowired
    ArtistServiceImpl artistService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("impressarios", service.getAll());
        return "impressarioList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Impressario> impressarios = service.getAll();
        List<Impressario> sorted = service.sortByName(impressarios);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("impressarios", sorted);
        return "impressarioList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        String word2 = searchForm.getSearchFieldReserve();
        List<Impressario> list;
        if(word == null) {
            list = service.searchByGenre(word2);
        } else {
            list = service.searchByName(word);
        };
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("impressarios", list);
        return "impressarioList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("impressarios", service.getAll());
        return "redirect:/web/impressario/list";
    }

    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        ImpressarioForm impressarioForm = new ImpressarioForm();
        Map<String, String> genre =  genreService.getAll().stream().collect(Collectors.toMap(
                Genre::getid, Genre::getGenre
        ));
       /* Map<String, String> artist =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));*/
        model.addAttribute("genre", genre);
        //model.addAttribute("artist", artist);
        model.addAttribute("impressarioForm", impressarioForm);
        return "impressarioAdd";
    }

    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("impressarioForm") ImpressarioForm impressarioForm) {
        Impressario group = new Impressario();
        Genre genre = genreService.get(impressarioForm.getGenre());
        //Artist artist = artistService.get(impressarioForm.getArtist());
        group.setGenre(genre);
        //group.setArtist(artist);
        group.setFirstName(impressarioForm.getFirstname());
        group.setDescription(impressarioForm.getDescription());
        service.save(group);
        model.addAttribute("impressarios", service.getAll());
        return "redirect:/web/impressario/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Impressario group = service.get(id);
        ImpressarioForm groupForm = new ImpressarioForm();
        Map<String, String> genre =  genreService.getAll().stream().collect(Collectors.toMap(
                Genre::getid, Genre::getGenre
        ));
        groupForm.setFirstname(group.getFirstName());
        groupForm.setGenre(group.getGenre().getGenre());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("genre", genre);
        model.addAttribute("impressarioForm", groupForm);
        return "impressarioEdit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("impressarioForm") ImpressarioForm impressarioForm) {
        Impressario group = new Impressario();
        group.setid(id);
        Genre genre = genreService.get(impressarioForm.getGenre());
        group.setFirstName(impressarioForm.getFirstname());
        group.setGenre(genre);
        group.setDescription(impressarioForm.getDescription());
        service.edit(group);
        model.addAttribute("impressarios", service.getAll());
        return "redirect:/web/impressario/list";
    }
}
