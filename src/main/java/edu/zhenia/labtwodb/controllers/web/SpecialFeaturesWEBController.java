package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.PlacesForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.forms.SpecialFeaturesForm;
import edu.zhenia.labtwodb.forms.TypeOfBuildingForm;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.Places;
import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.specialFeatures.impls.SpecialFeaturesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/specialfeatures")
public class SpecialFeaturesWEBController {
    @Autowired
    SpecialFeaturesServiceImpl service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("specialFeaturess", service.getAll());
        return "specialFeaturesList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        List <SpecialFeatures>  list = service.searchByType(word);
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("specialFeaturess", list);
        return "specialFeaturesList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<SpecialFeatures> specialFeatures = service.getAll();
        List<SpecialFeatures> sorted = service.sortByName(specialFeatures);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("specialFeaturess", sorted);
        return "specialFeaturesList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("specialFeaturess", service.getAll());
        return "redirect:/web/specialfeatures/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        SpecialFeaturesForm specialFeaturesForm = new SpecialFeaturesForm();
        model.addAttribute("specialFeaturesForm", specialFeaturesForm);
        return "specialFeaturesAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("specialFeaturesForm") SpecialFeaturesForm specialFeaturesForm) {
        SpecialFeatures group = new SpecialFeatures();
        group.setType(specialFeaturesForm.getType());
        //group.setValue(specialFeaturesForm.getValue());
        group.setDescription(specialFeaturesForm.getDescription());
        service.save(group);
        model.addAttribute("specialFeaturess", service.getAll());
        return "redirect:/web/specialfeatures/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        SpecialFeatures group = service.get(id);
        SpecialFeaturesForm groupForm = new SpecialFeaturesForm();
        groupForm.setType(group.getType());
        //groupForm.setValue(group.getValue());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("specialFeaturesForm", groupForm);
        return "specialFeaturesEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("specialFeaturesForm") SpecialFeaturesForm specialFeaturesForm) {
        SpecialFeatures group = new SpecialFeatures();
        group.setid(id);
        //group.setValue(specialFeaturesForm.getValue());
        group.setType(specialFeaturesForm.getType());
        group.setDescription(specialFeaturesForm.getDescription());
        service.edit(group);
        model.addAttribute("specialfeaturess", service.getAll());
        return "redirect:/web/specialfeatures/list";
    }
}
