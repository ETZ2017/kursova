package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.Winners;
import edu.zhenia.labtwodb.service.winners.impls.WinnersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/winners")
public class WinnersWEBController {
    @Autowired
    WinnersServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("winnerss", service.getAll());
        return "winnersList";
    }
}