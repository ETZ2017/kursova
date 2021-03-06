package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/impressario")
public class ImpressarioWEBController {
    @Autowired
    ImpressarioServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("impressarios", service.getAll());
        return "impressarioList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("impressarios", service.getAll());
        return "impressarioList";
    }
}
