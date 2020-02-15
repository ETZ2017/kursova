package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contest")
public class ContestController {
    @Autowired
    ContestServiceImpl service;

    @RequestMapping("/List")
    List<Contest> getall(){
        return service.getAll();
    }
}