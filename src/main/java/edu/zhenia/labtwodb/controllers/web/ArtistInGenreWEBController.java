package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.ArtistAtEventForm;
import edu.zhenia.labtwodb.forms.ArtistInGenreForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.artistInGenre.impls.ArtistInGenreServiceImpl;
import edu.zhenia.labtwodb.service.event.impls.EventServiceImpl;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/artistingenre")
public class ArtistInGenreWEBController {
    @Autowired
    ArtistInGenreServiceImpl service;

    @Autowired
    ArtistServiceImpl artistService;

    @Autowired
    GenreServiceImpl genreService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistInGenres", service.getAll());
        return "artistInGenreList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        String word2 = searchForm.getSearchFieldReserve();
        List<ArtistInGenre> list;
        if(word == null) {
            list = service.searchByGenre(word2);
        } else {
            list = service.searchByArtist(word);
        };
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistInGenres", list);
        return "artistInGenreList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<ArtistInGenre> artists = service.getAll();
        List<ArtistInGenre> sorted = service.sortByName(artists);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistInGenres", sorted);
        return "artistInGenreList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("artistInGenres", service.getAll());
        return "redirect:/web/artistingenre/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        ArtistInGenreForm artistInGenreForm = new ArtistInGenreForm();
        Map<String, String> mavs =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));
        Map<String, String> genre =  genreService.getAll().stream().collect(Collectors.toMap(
                Genre::getid, Genre::getGenre
        ));
        model.addAttribute("artistInGenreForm", artistInGenreForm);
        model.addAttribute("mavs", mavs);
        model.addAttribute("genre", genre);
        return "artistInGenreAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("artistInGenreForm") ArtistInGenreForm artistInGenreForm) {
        ArtistInGenre group = new ArtistInGenre();
        Artist artist = artistService.get(artistInGenreForm.getArtist());
        Genre genre = genreService.get(artistInGenreForm.getGenre());
        group.setArtist(artist);
        group.setGenre(genre);
        service.save(group);
        model.addAttribute("artistInGenres", service.getAll());
        return "redirect:/web/artistingenre/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        ArtistInGenre group = service.get(id);
        ArtistInGenreForm groupForm = new ArtistInGenreForm();
        Map<String, String> mavs =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));
        Map<String, String> genre =  genreService.getAll().stream().collect(Collectors.toMap(
                Genre::getid, Genre::getGenre
        ));
        groupForm.setId(group.getId());
        groupForm.setGenre(group.getGenre().getGenre());
        groupForm.setArtist(group.getArtist().getFirstName());
        model.addAttribute("mavs", mavs);
        model.addAttribute("genre", genre);
        model.addAttribute("artistInGenreForm", groupForm);
        return "artistInGenreEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("artistInGenreForm") ArtistInGenreForm artistInGenreForm) {
        ArtistInGenre group = new ArtistInGenre();
        group.setId(artistInGenreForm.getId());
        Artist artist = artistService.get(artistInGenreForm.getArtist());
        Genre genre = genreService.get(artistInGenreForm.getGenre());
        group.setGenre(genre);
        group.setArtist(artist);
        service.edit(group);
        model.addAttribute("artistInGenres", service.getAll());
        return "redirect:/web/artistingenre/list";
    }
}
