package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Organiser;
import edu.zhenia.labtwodb.service.organiser.impls.OrganiserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/organiser")
public class OrganiserWEBController {
    @Autowired
    OrganiserServiceImpl service;

    @RequestMapping("/list")
    String getall(){
        return "organiserList";
    }
}
