package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/typeofevent")
public class TypeOfEventWEBController {
    @Autowired
    TypeOfEventServiceImpl service;

    @RequestMapping("/list")
    String getall(){
        return "typeOfEventList";
    }
}