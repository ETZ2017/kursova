package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.event.impls.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/event")
public class EventWEBController {
    @Autowired
    EventServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("events", service.getAll());
        return "eventList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("events", service.getAll());
        return "eventList";
    }
}
