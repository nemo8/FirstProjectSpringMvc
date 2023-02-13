package com.example.spring_postgre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String resp(){
        return "index";
    }
    @GetMapping("aboutus")
    public String about(){
        return "aboutus";
    }
}
