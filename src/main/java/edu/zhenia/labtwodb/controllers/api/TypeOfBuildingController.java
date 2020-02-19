package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.TypeOfBuilding;
import edu.zhenia.labtwodb.service.typeOfBuilding.impls.TypeOfBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/typeofbuilding")
public class TypeOfBuildingController {
    @Autowired
    TypeOfBuildingServiceImpl service;

    @RequestMapping("/list")
    List<TypeOfBuilding> getall(){
        return service.getAll();
    }
}
