package edu.zhenia.labtwodb.controllers.web;

import edu.zhenia.labtwodb.forms.SearchForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AllTablesWEBController {
    @RequestMapping(value = "/web", method = RequestMethod.GET)
    String getall(){
        return "allTables";
    }
}
