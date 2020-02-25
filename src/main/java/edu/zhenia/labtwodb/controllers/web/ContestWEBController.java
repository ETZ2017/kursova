package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/contest")
public class ContestWEBController {
    @Autowired
    ContestServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("contests", service.getAll());
        return "contestList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("contests", service.getAll());
        return "contestList";
    }
}