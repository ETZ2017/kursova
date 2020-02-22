package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.model.SpecialFeatures;
import edu.zhenia.labtwodb.service.specialFeatures.impls.SpecialFeaturesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/specialfeatures")
public class SpecialFeaturesWEBController {
    @Autowired
    SpecialFeaturesServiceImpl service;

    @RequestMapping("/list")
    String getall(Model model){
        model.addAttribute("specialFeaturess", service.getAll());
        return "specialFeaturesList";
    }
}
