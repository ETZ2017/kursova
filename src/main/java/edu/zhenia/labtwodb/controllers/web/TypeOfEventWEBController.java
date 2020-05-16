package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.forms.TypeOfBuildingForm;
import edu.zhenia.labtwodb.forms.TypeOfEventForm;
import edu.zhenia.labtwodb.forms.WinnersForm;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/web/typeofevent")
public class TypeOfEventWEBController {
    @Autowired
    TypeOfEventServiceImpl service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("typeOfEvents", service.getAll());
        return "typeOfEventList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        List <TypeOfEvent>  list = service.searchByType(word);
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("typeOfEvents", list);
        return "typeOfEventList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<TypeOfEvent> typeOfBuildings = service.getAll();
        List<TypeOfEvent> sorted = service.sortByName(typeOfBuildings);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("typeOfEvents", sorted);
        return "typeOfEventList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("typeOfEvents", service.getAll());
        return "redirect:/web/typeofevent/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        TypeOfEventForm typeOfEventForm = new TypeOfEventForm();
        model.addAttribute("typeOfEventForm", typeOfEventForm);
        return "typeOfEventAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("typeOfEventForm") TypeOfEventForm typeOfEventForm) {
        TypeOfEvent group = new TypeOfEvent();
        group.setType(typeOfEventForm.getType());
        group.setDescription(typeOfEventForm.getDescription());

        Pattern pattern = Pattern.compile("^[A-Z][a-z: ]{1,30}");
        Matcher matcher = pattern.matcher(group.getType());
        if(matcher.matches()){
            service.save(group);
            model.addAttribute("typeOfEvents", service.getAll());
            return "redirect:/web/typeofevent/list";
        } else {
            return "validationFailed";
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        TypeOfEvent group = service.get(id);
        TypeOfEventForm groupForm = new TypeOfEventForm();
        groupForm.setType(group.getType());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("typeOfEventForm", groupForm);
        return "typeOfEventEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("typeOfEventForm") TypeOfEvent typeOfEvent) {
        TypeOfEvent group = new TypeOfEvent();
        group.setid(id);
        group.setType(typeOfEvent.getType());
        group.setDescription(typeOfEvent.getDescription());

        Pattern pattern = Pattern.compile("^[A-Z][a-z: ]{1,30}");
        Matcher matcher = pattern.matcher(group.getType());
        if(matcher.matches()){
            service.edit(group);
            model.addAttribute("typeOfEvents", service.getAll());
            return "redirect:/web/typeofevent/list";
        } else {
            return "validationFailed";
        }
    }
}