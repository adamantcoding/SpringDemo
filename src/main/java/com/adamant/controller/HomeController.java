package com.adamant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zrinka on 31.3.2017..
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("name", "Man!");
        return "home";
    }
}