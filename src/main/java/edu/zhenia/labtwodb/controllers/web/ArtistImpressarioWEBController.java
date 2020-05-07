package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.ArtistImpressarioForm;
import edu.zhenia.labtwodb.forms.SearchForm;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistImpressario;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.artistImpressario.impls.ArtistImpressarioServiceImpl;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/artistimpressario")
public class ArtistImpressarioWEBController {
    @Autowired
    ArtistImpressarioServiceImpl service;

    @Autowired
    ArtistServiceImpl artistService;

    @Autowired
    ImpressarioServiceImpl impressarioService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String getall(Model model){
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistImpressarios", service.getAll());
        return "artistImpressarioList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm){
        String word = searchForm.getSearchField();
        String word2 = searchForm.getSearchFieldReserve();
        List<ArtistImpressario> list;
        if(word == null) {
            list = service.searchByImpressario(word2);
        } else {
            list = service.searchByArtist(word);
        };
        searchForm.setSearchField("");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistImpressarios", list);
        return "artistImpressarioList";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String showSorted(Model model) {
        List<ArtistImpressario> artists = service.getAll();
        List<ArtistImpressario> sorted = service.sortByName(artists);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("artistImpressarios", sorted);
        return "artistImpressarioList";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("artistImpressarios", service.getAll());
        return "redirect:/web/artistimpressario/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.GET)
    String create(Model model){
        ArtistImpressarioForm artistImpressarioForm = new ArtistImpressarioForm();
        Map<String, String> artist =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));
        Map<String, String> impressario =  impressarioService.getAll().stream().collect(Collectors.toMap(
               Impressario::getid, Impressario::getFirstName
        ));
        model.addAttribute("artistImpressarioForm", artistImpressarioForm);
        model.addAttribute("artist", artist);
        model.addAttribute("impressario", impressario);
        return "artistImpressarioAdd";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("artistImpressarioForm") ArtistImpressarioForm artistImpressarioForm) {
        ArtistImpressario group = new ArtistImpressario();
        Artist artist = artistService.get(artistImpressarioForm.getArtist());
        Impressario impressario = impressarioService.get(artistImpressarioForm.getImpressario());
        group.setArtist(artist);
        group.setImpressario(impressario);
        service.save(group);
        model.addAttribute("artistImpressarios", service.getAll());
        return "redirect:/web/artistimpressario/list";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        ArtistImpressario group = service.get(id);
        ArtistImpressarioForm groupForm = new ArtistImpressarioForm();
        Map<String, String> artist =  artistService.getAll().stream().collect(Collectors.toMap(
                Artist::getid, Artist::getFirstName
        ));
        Map<String, String> impressario =  impressarioService.getAll().stream().collect(Collectors.toMap(
                Impressario::getid, Impressario::getFirstName
        ));
        groupForm.setId(group.getId());
        groupForm.setArtist(group.getArtist().getFirstName());
        groupForm.setImpressario(group.getImpressario().getFirstName());
        model.addAttribute("artistImpressarioForm", groupForm);
        model.addAttribute("artist", artist);
        model.addAttribute("impressario", impressario);
        return "artistImpressarioEdit";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("artistImpressarioForm") ArtistImpressarioForm artistImpressarioForm) {
        ArtistImpressario group = new ArtistImpressario();
        Artist artist = artistService.get(artistImpressarioForm.getArtist());
        Impressario impressario = impressarioService.get(artistImpressarioForm.getImpressario());
        group.setId(artistImpressarioForm.getId());
        group.setArtist(artist);
        group.setImpressario(impressario);
        service.edit(group);
        model.addAttribute("artistImpressarios", service.getAll());
        return "redirect:/web/artistimpressario/list";
    }
}
