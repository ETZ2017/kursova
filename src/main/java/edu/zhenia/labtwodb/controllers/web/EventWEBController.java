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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
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

        String dayBeg = searchForm.getDayBeg();
        String monthBeg = searchForm.getMonthBeg();
        String yearBeg = searchForm.getYearBeg();
        String dayEnd = searchForm.getDayEnd();
        String monthEnd = searchForm.getMonthEnd();
        String yearEnd = searchForm.getYearEnd();

        List<Event> list;
        if(word != null) {
            list = service.searchByName(word);
        } else {
            if(word2 != null) {
                list = service.searchByBuilding(word2);
            } else {
                if(word3 != null) {
                    list = service.searchByType(word3);
                } else {
                    if (word4 != null) {
                        list = service.searchByOrganiser(word4);
                    } else {
                        if(word5 != null) {
                            list = service.searchByContest(word5);
                        } else {
                            list = service.searchByDate(dayBeg, monthBeg, yearBeg, dayEnd, monthEnd, yearEnd);
                        }
                    }
                }
            }
        };
        searchForm.setSearchField("");
        searchForm.setSearchFieldReserve("");
        searchForm.setSearchFieldReserve2("");
        searchForm.setSearchFieldReserve3("");
        searchForm.setSearchFieldReserve4("");
        searchForm.setDayBeg("");
        searchForm.setDayEnd("");
        searchForm.setMonthEnd("");
        searchForm.setMonthBeg("");
        searchForm.setYearBeg("");
        searchForm.setYearEnd("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("events", list);
        return "eventList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("events", service.getAll());
        return "redirect:/web/event/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
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

    @PreAuthorize("hasRole('ADMIN')")
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
        if(eventForm.getMonth().length()< 2) {
            String newValue = "0" + eventForm.getMonth();
            eventForm.setMonth(newValue);
        }
        if(eventForm.getDay().length()< 2) {
            String newValue = "0" + eventForm.getDay();
            eventForm.setDay(newValue);
        }
        group.setDataString(eventForm.getYear()+"-"+eventForm.getMonth()+"-"+eventForm.getDay());
        group.setData (LocalDate.parse(String.valueOf(group.getDataString())));
        group.setName(eventForm.getName());
        group.setDescription(eventForm.getDescription());

        Pattern pattern = Pattern.compile("^[A-Z][a-z: ]{1,30}");
        Matcher matcher = pattern.matcher(group.getName());
        if(matcher.matches()){
            service.save(group);
            model.addAttribute("events", service.getAll());
            return "redirect:/web/event/list";
        } else {
            return "validationFailed";
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
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
        groupForm.setDay(group.getDataString().substring(8,10));
        groupForm.setMonth(group.getDataString().substring(5,7));
        groupForm.setYear(group.getDataString().substring(0,4));
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

    @PreAuthorize("hasRole('ADMIN')")
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
        if(eventForm.getMonth().length()< 2) {
            String newValue = "0" + eventForm.getMonth();
            eventForm.setMonth(newValue);
        }
        if(eventForm.getDay().length()< 2) {
            String newValue = "0" + eventForm.getDay();
            eventForm.setDay(newValue);
        }
        group.setDataString(eventForm.getYear()+"-"+eventForm.getMonth()+"-"+eventForm.getDay());
        group.setData (LocalDate.parse(group.getDataString()));
        group.setDescription(eventForm.getDescription());

        Pattern pattern = Pattern.compile("^[A-Z][a-z: ]{1,30}");
        Matcher matcher = pattern.matcher(group.getName());
        if(matcher.matches()){
            service.edit(group);
            model.addAttribute("events", service.getAll());
            return "redirect:/web/event/list";
        } else {
            return "validationFailed";
        }
    }
}
