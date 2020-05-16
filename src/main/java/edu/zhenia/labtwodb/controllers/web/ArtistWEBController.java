package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.ArtistForm;
import edu.zhenia.labtwodb.forms.ContestForm;
import edu.zhenia.labtwodb.forms.OrganiserForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/artist")
public class ArtistWEBController {
    @Autowired
    ArtistServiceImpl service;

    @Autowired
    GenreServiceImpl genreService;

    @Autowired
    ImpressarioServiceImpl impressarioService;

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artists", service.getAll());
        return "artistList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                                @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        List <Artist>  list = service.search(word);
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artists", list);
        return "artistList";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Artist> artists = service.getAll();
        List<Artist> sorted = service.sortByName(artists);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artists", sorted);
        return "artistList";
    }


    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("artists", service.getAll());
        return "redirect:/web/artist/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
//        System.out.println("Called");
        ArtistForm artistForm = new ArtistForm();
        /*Map<String, String> mavs =  genreService.getAll().stream().collect(Collectors.toMap(
                Genre::getid, Genre::getGenre
        ));*/
        /*Map<String, String> impressario =  impressarioService.getAll().stream().collect(Collectors.toMap(
                Impressario::getid, Impressario::getFirstName
        ));*/
        model.addAttribute("artistForm", artistForm);
//        model.addAttribute("mavs", mavs);
       // model.addAttribute("impressario", impressario);
        return "artistAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("artistForm") ArtistForm artistForm) {
        Artist group = new Artist();
//        Genre genre = genreService.get(artistForm.getGenre());
        //Impressario impressario = impressarioService.get(artistForm.getImpressario());
        group.setFirstName(artistForm.getFirstname());
//        group.setGenre(genre);
        //group.setImpressario(impressario);
        group.setDescription(artistForm.getDescription());

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{1,15}[ ][A-Z]{1}[a-z]{1,15}");
        Matcher matcher = pattern.matcher(group.getFirstName());
        if(matcher.matches()) {
            service.save(group);
            model.addAttribute("artists", service.getAll());
            return "redirect:/web/artist/list";
        } else {
            return "validationFailed";
        }

    }


    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Artist group = service.get(id);
        ArtistForm groupForm = new ArtistForm();
//        Map<String, String> mavs = genreService.getAll().stream()
//                .collect(Collectors.toMap(Genre::getid, Genre::getGenre));

        groupForm.setId(group.getid());
        groupForm.setFirstname(group.getFirstName());
//        groupForm.setGenre(group.getGenre().getGenre());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("artistForm", groupForm);
//        model.addAttribute("mavs", mavs);
        return "artistEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("artistForm") ArtistForm artistForm) {
        Artist group = new Artist();
        group.setid(artistForm.getId());
//        Genre genre = genreService.get(artistForm.getGenre());
//        group.setGenre(genre);
        group.setFirstName(artistForm.getFirstname());
        group.setDescription(artistForm.getDescription());

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{1,15}[ ][A-Z]{1}[a-z]{1,15}");
        Matcher matcher = pattern.matcher(group.getFirstName());
        if(matcher.matches()) {
            service.edit(group);
            model.addAttribute("artists", service.getAll());
            return "redirect:/web/artist/list";
        } else {
            return "validationFailed";
        }
    }


}
