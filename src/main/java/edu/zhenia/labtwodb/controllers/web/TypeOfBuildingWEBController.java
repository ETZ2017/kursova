package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.typeOfBuilding.impls.TypeOfBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/typeofbuilding")
public class TypeOfBuildingWEBController {
    @Autowired
    TypeOfBuildingServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("typeOfBuildings", service.getAll());
        return "typeOfBuildingList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("typeOfBuildings", service.getAll());
        return "typeOfBuildingList";
    }
}
