package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.forms.TypeOfEventForm;
import edu.zhenia.labtwodb.forms.WinnersForm;
import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import edu.zhenia.labtwodb.service.organiser.impls.OrganiserServiceImpl;
import edu.zhenia.labtwodb.service.places.impls.PlacesServiceImpl;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;
import edu.zhenia.labtwodb.service.winners.impls.WinnersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/winners")
public class WinnersWEBController {
    @Autowired
    WinnersServiceImpl service;

    @Autowired
    ArtistServiceImpl artistService;

    @Autowired
    PlacesServiceImpl placesService;

    @Autowired
    ContestServiceImpl contestService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("winnerss", service.getAll());
        return "winnersList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        String word2 = searchForm.getSearchFieldReserve();
        String word3 = searchForm.getSearchFieldReserve2();
        List<Winners> list;
        if(word == null) {
            if(word3 == null) {
            list = service.searchByContest(word2);
            } else {
                list = service.searchByPlace(word3);
            }
        } else {
            list = service.searchByArtist(word);
        };
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("winnerss", list);
        return "winnersList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Winners> winners = service.getAll();
        List<Winners> sorted = service.sortByName(winners);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("winnerss", sorted);
        return "winnersList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("winnerss", service.getAll());
        return "redirect:/web/winners/list";
    }

    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        WinnersForm winnersForm = new WinnersForm();
        Map<String, String> artist =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));
        Map<String, String> places =  placesService.getAll().stream().collect(Collectors.toMap(
                Places::getid, Places::getPlace
        ));
        Map<String, String> contest =  contestService.getAll().stream().collect(Collectors.toMap(
                Contest::getid, Contest::getName
        ));
        model.addAttribute("artist", artist);
        model.addAttribute("places", places);
        model.addAttribute("contest", contest);
        model.addAttribute("winnersForm", winnersForm);
        return "winnersAdd";
    }

    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("winnersForm") WinnersForm winnersForm) {
        Winners group = new Winners();
        Places places = placesService.get(winnersForm.getPlace());
        Artist artist = artistService.get(winnersForm.getArtist());
        Contest contest = contestService.get(winnersForm.getContest());
        group.setContest(contest);
        group.setArtist(artist);
        group.setPlace(places);
        group.setDescription(winnersForm.getDescription());
        service.save(group);
        model.addAttribute("winnerss", service.getAll());
        return "redirect:/web/winners/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Winners group = service.get(id);
        WinnersForm groupForm = new WinnersForm();
        Map<String, String> artist =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));
        Map<String, String> places =  placesService.getAll().stream().collect(Collectors.toMap(
                Places::getid, Places::getPlace
        ));
        Map<String, String> contest =  contestService.getAll().stream().collect(Collectors.toMap(
                Contest::getid, Contest::getName
        ));
        model.addAttribute("artist", artist);
        model.addAttribute("places", places);
        model.addAttribute("contest", contest);
        groupForm.setArtist(group.getArtist().getFirstName());
        groupForm.setPlace(group.getPlace().getPlace());
        groupForm.setContest(group.getContest().getName());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("winnersForm", groupForm);
        return "winnersEdit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("winnersForm") WinnersForm winnersForm) {
        Winners group = new Winners();
        group.setid(id);
        Places places = placesService.get(winnersForm.getPlace());
        Artist artist = artistService.get(winnersForm.getArtist());
        Contest contest = contestService.get(winnersForm.getContest());
        group.setContest(contest);
        group.setArtist(artist);
        group.setPlace(places);
        group.setDescription(winnersForm.getDescription());
        service.edit(group);
        model.addAttribute("winnerss", service.getAll());
        return "redirect:/web/winners/list";
    }
}