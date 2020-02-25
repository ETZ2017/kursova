package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/typeofevent")
public class TypeOfEventWEBController {
    @Autowired
    TypeOfEventServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("typeOfEvents", service.getAll());
        return "typeOfEventList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("typeOfEvents", service.getAll());
        return "typeOfEventList";
    }
}