package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.service.organiser.impls.OrganiserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organiser")
public class OrganiserController {
    @Autowired
    OrganiserServiceImpl service;

    @RequestMapping("/list")
    List<Organiser> getall(){
        return service.getAll();
    }
}
