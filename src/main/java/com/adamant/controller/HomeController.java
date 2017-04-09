package com.adamant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ivan on 31.3.2017..
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("name", "man!");
        return "home";
    }
}