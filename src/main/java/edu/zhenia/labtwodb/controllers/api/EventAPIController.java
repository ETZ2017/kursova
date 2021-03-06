package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Event;
import edu.zhenia.labtwodb.service.event.impls.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventAPIController {
    @Autowired
    EventServiceImpl service;

    @RequestMapping("/list")
    List<Event> getall(){
        return service.getAll();
    }
}
