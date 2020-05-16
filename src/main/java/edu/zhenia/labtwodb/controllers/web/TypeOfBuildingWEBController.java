package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.*;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.typeOfBuilding.impls.TypeOfBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/web/typeofbuilding")
public class TypeOfBuildingWEBController {
    @Autowired
    TypeOfBuildingServiceImpl service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("typeOfBuildings", service.getAll());
        return "typeOfBuildingList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        List <TypeOfBuilding>  list = service.searchByType(word);
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("typeOfBuildings", list);
        return "typeOfBuildingList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<TypeOfBuilding> typeOfBuildings = service.getAll();
        List<TypeOfBuilding> sorted = service.sortByName(typeOfBuildings);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("typeOfBuildings", sorted);
        return "typeOfBuildingList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("typeOfBuildings", service.getAll());
        return "redirect:/web/typeofbuilding/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        TypeOfBuildingForm typeOfBuildingForm = new TypeOfBuildingForm();
        model.addAttribute("typeOfBuildingForm", typeOfBuildingForm);
        return "typeOfBuildingAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("typeOfBuildingForm") TypeOfBuildingForm typeOfBuildingForm) {
        TypeOfBuilding group = new TypeOfBuilding();
        group.setType(typeOfBuildingForm.getType());
        group.setDescription(typeOfBuildingForm.getDescription());


        Pattern pattern = Pattern.compile("^[A-Z][a-z: ]{1,30}");
        Matcher matcher = pattern.matcher(group.getType());
        if(matcher.matches()){
            service.save(group);
            model.addAttribute("typeOfBuildings", service.getAll());
            return "redirect:/web/typeofbuilding/list";
        } else {
            return "validationFailed";
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        TypeOfBuilding group = service.get(id);
        TypeOfBuildingForm groupForm = new TypeOfBuildingForm();
        groupForm.setType(group.getType());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("typeOfBuildingForm", groupForm);
        return "typeOfBuildingEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("typeOfBuildingForm") TypeOfBuilding typeOfBuilding) {
        TypeOfBuilding group = new TypeOfBuilding();
        group.setid(id);
        group.setType(typeOfBuilding.getType());
        group.setDescription(typeOfBuilding.getDescription());


        Pattern pattern = Pattern.compile("^[A-Z][a-z: ]{1,30}");
        Matcher matcher = pattern.matcher(group.getType());
        if(matcher.matches()){
            service.edit(group);
            model.addAttribute("tupeOfBuildings", service.getAll());
            return "redirect:/web/typeofbuilding/list";
        } else {
            return "validationFailed";
        }
    }
}
