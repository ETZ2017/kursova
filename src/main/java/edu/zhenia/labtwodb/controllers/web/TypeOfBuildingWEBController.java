package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.typeOfBuilding.impls.TypeOfBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/typeofbuilding")
public class TypeOfBuildingWEBController {
    @Autowired
    TypeOfBuildingServiceImpl service;

    @RequestMapping("/list")
    String getall(){
        return "typeOfBuildingList";
    }
}
