package com.example.spring_postgre.controllers;

import com.example.spring_postgre.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/advert")
public class Advert {
    @PostMapping
    public String advertDesc(@RequestParam String name,@RequestParam String price,
                             @RequestParam String weight,@RequestParam String desc,
                             @RequestParam long id,@RequestParam String volume, Model model){
        Product product = new Product();
        product.setName(name);
        product.setDesc(desc);
        product.setWeight(weight);
        product.setPrice(price);
        product.setId(id);
        product.setVolume(volume);
        model.addAttribute("advert",product);
        return "advert";
    }
}
