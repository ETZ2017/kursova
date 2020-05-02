package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.ArtistForm;
import edu.zhenia.labtwodb.forms.ContestForm;
import edu.zhenia.labtwodb.forms.GenreForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.model.Genre;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/contest")
public class ContestWEBController {
    @Autowired
    ContestServiceImpl service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("contests", service.getAll());
        return "contestList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        List <Contest>  list = service.search(word);
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("contests", list);
        return "contestList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<Contest> contests = service.getAll();
        List<Contest> sorted = service.sortByName(contests);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("contests", sorted);
        return "contestList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("contests", service.getAll());
        return "redirect:/web/contest/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        ContestForm contestForm = new ContestForm();
        model.addAttribute("contestForm", contestForm);
        return "contestAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("contestForm") ContestForm contestForm) {
        Contest group = new Contest();
        group.setName(contestForm.getcontest());
        group.setDescription(contestForm.getDescription());
        service.save(group);
        model.addAttribute("contests", service.getAll());
        return "redirect:/web/contest/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Contest group = service.get(id);
        ContestForm groupForm = new ContestForm();
        groupForm.setcontest(group.getName());
        groupForm.setDescription(group.getDescription());
        model.addAttribute("contestForm", groupForm);
        return "contestEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("contestForm") ContestForm contestForm) {
        Contest group = new Contest();
        group.setid(id);
        group.setName(contestForm.getcontest());
        group.setDescription(contestForm.getDescription());
        service.edit(group);
        model.addAttribute("contests", service.getAll());
        return "redirect:/web/contest/list";
    }
}