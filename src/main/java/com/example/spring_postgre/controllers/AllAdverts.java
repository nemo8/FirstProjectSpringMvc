package com.example.spring_postgre.controllers;

import com.example.spring_postgre.models.Product;
import com.example.spring_postgre.repositories.AdvertAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/allAdverts")
public class AllAdverts {
    final
    AdvertAction advertAction;
    @Autowired
    public AllAdverts(AdvertAction advertAction) {
        this.advertAction = advertAction;
    }

    @GetMapping
    public String allAdverts(Model model){
        List<Product> list = new ArrayList<>();
        list=(List<Product>) advertAction.findAll();
        model.addAttribute("adverts",list);
        return "allAdverts";
    }
}
