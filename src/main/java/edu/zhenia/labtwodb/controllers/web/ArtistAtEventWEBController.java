package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.ArtistAtEventForm;
import edu.zhenia.labtwodb.forms.ArtistForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.artistAtEvent.impls.ArtistAtEventServiceImpl;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import edu.zhenia.labtwodb.service.event.impls.EventServiceImpl;
import edu.zhenia.labtwodb.service.genre.impls.GenreServiceImpl;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/artistatevent")
public class ArtistAtEventWEBController {
    @Autowired
    ArtistAtEventServiceImpl service;

    @Autowired
    ArtistServiceImpl artistService;

    @Autowired
    EventServiceImpl eventService;

    @Autowired
    ContestServiceImpl contestService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistAtEvents", service.getAll());
        return "artistAtEventList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        String word2 = searchForm.getSearchFieldReserve();
        //String word3 = searchForm.getSearchFieldReserve2();
        List<ArtistAtEvent> list;
            if(word == null) {
                //if(word3 == null) {
                    list = service.searchByEvent(word2);
                //} else {
                    ///list = service.searchByContest(word3);
               // }
            } else {
                list = service.searchByArtist(word);
            };
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistAtEvents", list);
        return "artistAtEventList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<ArtistAtEvent> artists = service.getAll();
        List<ArtistAtEvent> sorted = service.sortByName(artists);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistAtEvents", sorted);
        return "artistAtEventList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("artistAtEvents", service.getAll());
        return "artistAtEventList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        ArtistAtEventForm artistAtEventForm = new ArtistAtEventForm();
        Map<String, String> mavs =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));
        Map<String, String> event =  eventService.getAll().stream().collect(Collectors.toMap(
                Event::getid, Event::getName
        ));
        Map<String, String> contest =  contestService.getAll().stream().collect(Collectors.toMap(
                Contest::getid, Contest::getName
        ));
        model.addAttribute("artistAtEventForm", artistAtEventForm);
        model.addAttribute("mavs", mavs);
        model.addAttribute("event", event);
        model.addAttribute("contest", contest);
        return "artistAtEventAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("artistAtEventForm") ArtistAtEventForm artistAtEventForm) {
        ArtistAtEvent group = new ArtistAtEvent();
        Event event = eventService.get(artistAtEventForm.getEvent());
        //Contest contest = contestService.get(artistAtEventForm.getContest());
        Artist artist = artistService.get(artistAtEventForm.getArtist());
        group.setArtist(artist);
        group.setEvent(event);
        //group.setContest(contest);
        service.save(group);
        model.addAttribute("artistAtEvents", service.getAll());
        return "redirect:/web/artistatevent/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        ArtistAtEvent group = service.get(id);
        ArtistAtEventForm groupForm = new ArtistAtEventForm();
        Map<String, String> mavs =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));
        Map<String, String> event =  eventService.getAll().stream().collect(Collectors.toMap(
                Event::getid, Event::getName
        ));
        Map<String, String> contest =  contestService.getAll().stream().collect(Collectors.toMap(
                Contest::getid, Contest::getName
        ));
//        group.setDateCreated(group.getDateCreated());
//        group.setDateModified(LocalDateTime.now());
        groupForm.setArtist(group.getArtist().getFirstName());
        groupForm.setEvent(group.getEvent().getName());
        //groupForm.setContest(group.getContest().getName());
        model.addAttribute("mavs", mavs);
        model.addAttribute("event", event);
        model.addAttribute("contest", contest);
        model.addAttribute("artistAtEventForm", groupForm);
        return "artistAtEventEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("artistAtEventForm") ArtistAtEventForm artistAtEventForm) {
        ArtistAtEvent group = new ArtistAtEvent();
        Event event = eventService.get(artistAtEventForm.getEvent());
        Contest contest = contestService.get(artistAtEventForm.getContest());
        Artist artist = artistService.get(artistAtEventForm.getArtist());
        group.setArtist(artist);
        //group.setContest(contest);
        group.setEvent(event);
        service.edit(group);
        model.addAttribute("artistAtEvents", service.getAll());
        return "redirect:/web/artistatevent/list";
    }
}
