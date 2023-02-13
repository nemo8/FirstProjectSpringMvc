package com.example.spring_postgre.controllers;

import com.example.spring_postgre.models.Product;
import com.example.spring_postgre.repositories.AdvertAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addAdvert")
public class AddAdvertController {
    final
    AdvertAction advertAction;
    @Autowired
    public AddAdvertController(AdvertAction advertAction) {
        this.advertAction = advertAction;
    }

    @GetMapping
    public String addAdvert(){
        return "addAdvert";
    }
    @PostMapping
    public String addProduct(@RequestParam String name,@RequestParam String weight,
                              @RequestParam String price,@RequestParam String desc,@RequestParam String volume){
        Product product = new Product();
        product.setName(name);
        product.setWeight(weight);
        product.setDesc(desc);
        product.setPrice(price);
        product.setVolume(volume);
        advertAction.save(product);
        return "addAdvert";
    }

}
