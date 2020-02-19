package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/impressario")
public class ImpressarioController {
    @Autowired
    ImpressarioServiceImpl service;

    @RequestMapping("/list")
    List<Impressario> getall(){
        return service.getAll();
    }
}
