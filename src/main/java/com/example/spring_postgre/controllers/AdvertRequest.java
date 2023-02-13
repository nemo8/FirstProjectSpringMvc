package com.example.spring_postgre.controllers;

import com.example.spring_postgre.models.Customer;
import com.example.spring_postgre.repositories.RequestAdvert;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/advertRequest")
public class AdvertRequest {
    final
    RequestAdvert requestAdvert;

    public AdvertRequest(RequestAdvert requestAdvert) {
        this.requestAdvert = requestAdvert;
    }

    @PostMapping
    public String requestProduct(@RequestParam String name,@RequestParam String connection,
                                  @RequestParam String data,@RequestParam String product ){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setConnection(connection);
        customer.setData(data);
        customer.setProduct(product);
        requestAdvert.save(customer);
        return "allAdverts";
    }
}
