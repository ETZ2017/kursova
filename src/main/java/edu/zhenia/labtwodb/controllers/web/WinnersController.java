package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.winners.impls.WinnersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/winners")
public class WinnersController {
    @Autowired
    WinnersServiceImpl service;

    @RequestMapping("/List")
    List<Winners> getall(){
        return service.getAll();
    }
}