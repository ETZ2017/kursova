package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.CulturalBuilding;
import edu.zhenia.labtwodb.service.culturalBuilding.impls.CulturalBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/building")
public class CulturalBuildingController {
    @Autowired
    CulturalBuildingServiceImpl service;

    @RequestMapping("/List")
    List<CulturalBuilding> getall(){
        return service.getAll();
    }
}
