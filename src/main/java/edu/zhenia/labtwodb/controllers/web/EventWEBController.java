package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.CulturalBuildingForm;
import edu.zhenia.labtwodb.forms.EventForm;
import edu.zhenia.labtwodb.forms.GenreForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import edu.zhenia.labtwodb.service.culturalBuilding.impls.CulturalBuildingServiceImpl;
import edu.zhenia.labtwodb.service.event.impls.EventServiceImpl;
import edu.zhenia.labtwodb.service.organiser.impls.OrganiserServiceImpl;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/event")
public class EventWEBController {
    @Autowired
    EventServiceImpl service;

    @Autowired
    CulturalBuildingServiceImpl buildingService;

    @Autowired
    TypeOfEventServiceImpl typeOfEventService;

    @Autowired
    OrganiserServiceImpl organiserService;

    @Autowired
    ContestServiceImpl contestService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("events", service.getAll());
        return "eventList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Event> events = service.getAll();
        List<Event> sorted = service.sortByName(events);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("events", sorted);
        return "eventList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        String word2 = searchForm.getSearchFieldReserve();
        String word3 = searchForm.getSearchFieldReserve2();
        String word4 = searchForm.getSearchFieldReserve3();
        String word5 = searchForm.getSearchFieldReserve4();
        List<Event> list;
        if(word == null) {
            if(word2 == null) {
                if(word3 == null) {
                    if (word4 == null) {
                        list = service.searchByContest(word5);
                    } else {
                        list = service.searchByOrganiser(word4);
                    }
                } else {
                    list = service.searchByType(word3);
                }
            } else {
                list = service.searchByBuilding(word2);
            }
        } else {
            list = service.searchByName(word);
        };
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("events", list);
        return "eventList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("events", service.getAll());
        return "redirect:/web/event/list";
    }

    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        EventForm eventForm = new EventForm();
        Map<String, String> building =  buildingService.getAll().stream().collect(Collectors.toMap(
                CulturalBuilding::getid, CulturalBuilding::getName
        ));
        Map<String, String> type =  typeOfEventService.getAll().stream().collect(Collectors.toMap(
                TypeOfEvent::getid, TypeOfEvent::getType
        ));
        Map<String, String> organiser =  organiserService.getAll().stream().collect(Collectors.toMap(
                Organiser::getid, Organiser::getFirstName
        ));
        Map<String, String> contest =  contestService.getAll().stream().collect(Collectors.toMap(
                Contest::getid, Contest::getName
        ));
        model.addAttribute("type", type);
        model.addAttribute("building", building);
        model.addAttribute("organiser", organiser);
        model.addAttribute("contest", contest);
        model.addAttribute("eventForm", eventForm);
        return "eventAdd";
    }

    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("eventForm") EventForm eventForm) {
        Event group = new Event();
        CulturalBuilding building = buildingService.get(eventForm.getBuilding());
        TypeOfEvent type = typeOfEventService.get(eventForm.getTypeOfEvent());
        Organiser organiser = organiserService.get(eventForm.getOrganiser());
        Contest contest = contestService.get(eventForm.getContest());
        group.setBuilding(building);
        group.setContest(contest);
        group.setOrganizer(organiser);
        group.setTypeOfEvent(type);
        group.setName(eventForm.getName());
        group.setData(eventForm.getDate());
        group.setDescription(eventForm.getDescription());
        service.save(group);
        model.addAttribute("events", service.getAll());
        return "redirect:/web/event/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Event group = service.get(id);
        EventForm groupForm = new EventForm();
        Map<String, String> building =  buildingService.getAll().stream().collect(Collectors.toMap(
                CulturalBuilding::getid, CulturalBuilding::getName
        ));
        Map<String, String> type =  typeOfEventService.getAll().stream().collect(Collectors.toMap(
                TypeOfEvent::getid, TypeOfEvent::getType
        ));
        Map<String, String> organiser =  organiserService.getAll().stream().collect(Collectors.toMap(
                Organiser::getid, Organiser::getFirstName
        ));
        Map<String, String> contest =  contestService.getAll().stream().collect(Collectors.toMap(
                Contest::getid, Contest::getName
        ));
        groupForm.setName(group.getName());
        groupForm.setBuilding(group.getBuilding().getName());
        groupForm.setContest(group.getContest().getName());
        groupForm.setOrganiser(group.getOrganizer().getFirstName());
        groupForm.setTypeOfEvent(group.getTypeOfEvent().getType());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("type", type);
        model.addAttribute("building", building);
        model.addAttribute("organiser", organiser);
        model.addAttribute("contest", contest);
        model.addAttribute("eventForm", groupForm);
        return "eventEdit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("eventForm") EventForm eventForm) {
        Event group = new Event();
        group.setid(id);
        group.setName(eventForm.getName());
        CulturalBuilding building = buildingService.get(eventForm.getBuilding());
        TypeOfEvent type = typeOfEventService.get(eventForm.getTypeOfEvent());
        Organiser organiser = organiserService.get(eventForm.getOrganiser());
        Contest contest = contestService.get(eventForm.getContest());
        group.setBuilding(building);
        group.setContest(contest);
        group.setOrganizer(organiser);
        group.setTypeOfEvent(type);
        group.setDescription(eventForm.getDescription());
        service.edit(group);
        model.addAttribute("events", service.getAll());
        return "redirect:/web/event/list";
    }
}
