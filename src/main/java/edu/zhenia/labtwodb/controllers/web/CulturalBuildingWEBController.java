package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.service.culturalBuilding.impls.CulturalBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/building")
public class CulturalBuildingWEBController {
    @Autowired
    CulturalBuildingServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("culturalBuildings", service.getAll());
        return "culturalBuildingList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("culturalBuildings", service.getAll());
        return "culturalBuildingList";
    }
}
