package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.TypeOfEvent;
import edu.zhenia.labtwodb.service.typeOfEvent.impls.TypeOfEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/typeofevent")
public class TypeOfEventController {
    @Autowired
    TypeOfEventServiceImpl service;

    @RequestMapping("/list")
    List<TypeOfEvent> getall(){
        return service.getAll();
    }
}