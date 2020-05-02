package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.*;
import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.culturalBuilding.impls.CulturalBuildingServiceImpl;
import edu.zhenia.labtwodb.service.specialFeatures.impls.SpecialFeaturesServiceImpl;
import edu.zhenia.labtwodb.service.typeOfBuilding.impls.TypeOfBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/building")
public class CulturalBuildingWEBController {
    @Autowired
    CulturalBuildingServiceImpl service;

    @Autowired
    TypeOfBuildingServiceImpl serviceBuilding;

    @Autowired
    SpecialFeaturesServiceImpl serviceSpecial;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("culturalBuildings", service.getAll());
        return "culturalBuildingList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        String word2 = searchForm.getSearchFieldReserve();
        String word3 = searchForm.getSearchFieldReserve2();
        String word4 = searchForm.getSearchFieldReserve3();
        List<CulturalBuilding> list;
        if(word == null) {
            if(word4 == null) {
                list = service.searchBySpecials(word2, word3);
            } else {
                list= service.searchByName(word4);
            }
        } else {
            list = service.searchByType(word);
        };
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("culturalBuildings", list);
        return "culturalBuildingList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<CulturalBuilding> buildings = service.getAll();
        List<CulturalBuilding> sorted = service.sortByName(buildings);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("culturalBuildings", sorted);
        return "culturalBuildingList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("culturalBuildings", service.getAll());
        return "redirect:/web/building/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        CulturalBuildingForm culturalBuildingForm = new CulturalBuildingForm();
        Map<String, String> type =  serviceBuilding.getAll().stream().collect(Collectors.toMap(
                TypeOfBuilding::getid, TypeOfBuilding::getType
        ));
        Map<String, String> specials =  serviceSpecial.getAll().stream().collect(Collectors.toMap(
                SpecialFeatures::getid, SpecialFeatures::getType
        ));
        model.addAttribute("type", type);
        model.addAttribute("specials", specials);
        model.addAttribute("culturalBuildingForm", culturalBuildingForm);
        return "culturalBuildingAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("culturalBuildingForm") CulturalBuildingForm culturalBuildingForm) {
        CulturalBuilding group = new CulturalBuilding();
        TypeOfBuilding type = serviceBuilding.get(culturalBuildingForm.getType());
        SpecialFeatures specialFeatures = serviceSpecial.get(culturalBuildingForm.getSpecials());
        group.setType(type);
        group.setSpecials(specialFeatures);
        group.setValue(culturalBuildingForm.getValue());
        group.setName(culturalBuildingForm.getName());
        group.setDescription(culturalBuildingForm.getDescription());
        service.save(group);
        model.addAttribute("culturalBuildings", service.getAll());
        return "redirect:/web/building/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        CulturalBuilding group = service.get(id);
        CulturalBuildingForm groupForm = new CulturalBuildingForm();
        groupForm.setName(group.getName());
        groupForm.setDescription(group.getDescription());
        Map<String, String> type =  serviceBuilding.getAll().stream().collect(Collectors.toMap(
                TypeOfBuilding::getid, TypeOfBuilding::getType
        ));
        Map<String, String> specials =  serviceSpecial.getAll().stream().collect(Collectors.toMap(
                SpecialFeatures::getid, SpecialFeatures::getType
        ));
        groupForm.setSpecials(group.getSpecials().getType());
        groupForm.setType(group.getType().getType());
        groupForm.setValue(group.getValue());
        model.addAttribute("type", type);
        model.addAttribute("specials", specials);
        model.addAttribute("culturalBuildingForm", groupForm);
        return "culturalBuildingEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("culturalBuildingForm") CulturalBuildingForm culturalBuildingForm) {
        CulturalBuilding group = new CulturalBuilding();
        TypeOfBuilding type = serviceBuilding.get(culturalBuildingForm.getType());
        SpecialFeatures specialFeatures = serviceSpecial.get(culturalBuildingForm.getSpecials());
        group.setid(id);
        group.setSpecials(specialFeatures);
        group.setType(type);
        group.setName(culturalBuildingForm.getName());
        group.setValue(culturalBuildingForm.getValue());
        group.setDescription(culturalBuildingForm.getDescription());
        service.edit(group);
        model.addAttribute("culturalBuildings", service.getAll());
        return "redirect:/web/building/list";
    }
}