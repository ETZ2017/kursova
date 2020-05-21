package edu.zhenia.labtwodb.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Error403WEBController {
    @RequestMapping("/403")
    public String accessDenied() {
        return "403";
    }
}
