package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.ImpressarioForm;
import edu.zhenia.labtwodb.forms.OrganiserForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.forms.TypeOfBuildingForm;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.organiser.impls.OrganiserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/organiser")
public class OrganiserWEBController {
    @Autowired
    OrganiserServiceImpl service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("organisers", service.getAll());
        return "organiserList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        List <Organiser>  list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("organisers", list);
        return "organiserList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Organiser> organisers = service.getAll();
        List<Organiser> sorted = service.sortByName(organisers);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("organisers", sorted);
        return "organiserList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("organisers", service.getAll());
        return "redirect:/web/organiser/list";
    }

    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        OrganiserForm organiserForm = new OrganiserForm();
        model.addAttribute("organiserForm", organiserForm);
        return "organiserAdd";
    }

    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("organiserForm") OrganiserForm organiserForm) {
        Organiser group = new Organiser();
        group.setFirstName(organiserForm.getFirstname());
        group.setDescription(organiserForm.getDescription());
        service.save(group);
        model.addAttribute("organisers", service.getAll());
        return "redirect:/web/organiser/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Organiser group = service.get(id);
        OrganiserForm groupForm = new OrganiserForm();
        groupForm.setFirstname(group.getFirstName());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("organiserForm", groupForm);
        return "organiserEdit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("organiserForm") OrganiserForm organiserForm) {
        Organiser group = new Organiser();
        group.setid(id);
        group.setFirstName(organiserForm.getFirstname());
        group.setDescription(organiserForm.getDescription());
        service.edit(group);
        model.addAttribute("organisers", service.getAll());
        return "redirect:/web/organiser/list";
    }
}
