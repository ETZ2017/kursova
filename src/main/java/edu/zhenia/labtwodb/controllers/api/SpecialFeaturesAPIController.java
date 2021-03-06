package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.service.specialFeatures.impls.SpecialFeaturesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/specialfeatures")
public class SpecialFeaturesAPIController {
    @Autowired
    SpecialFeaturesServiceImpl service;

    @RequestMapping("/list")
    List<SpecialFeatures> getall(){
        return service.getAll();
    }
}
