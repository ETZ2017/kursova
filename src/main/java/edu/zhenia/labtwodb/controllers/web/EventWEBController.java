package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.event.impls.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/event")
public class EventWEBController {
    @Autowired
    EventServiceImpl service;

    @RequestMapping("/list")
    String getall(){
        return "eventList";
    }
}
