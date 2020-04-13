package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.*;
import edu.zhenia.labtwodb.service.typeOfBuilding.impls.TypeOfBuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typeofbuilding")
public class TypeOfBuildingAPIController {
    @Autowired
    TypeOfBuildingServiceImpl service;

    @RequestMapping("/list")
    List<TypeOfBuilding> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    TypeOfBuilding get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    TypeOfBuilding edit(@RequestBody TypeOfBuilding typeOfBuilding){
        return service.edit(typeOfBuilding);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    TypeOfBuilding create(@RequestBody TypeOfBuilding typeOfBuilding){
        return service.save(typeOfBuilding);
    }

    @RequestMapping("/delete/{id}")
    TypeOfBuilding delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
