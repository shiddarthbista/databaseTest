package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondApi {

    @Autowired
    Laptop laptop;

    @Value("ted")
    String name;

    @GetMapping("getprice")
    public int getPrice(){
        return laptop.laptopPrice;
    }

    @GetMapping("/secondapi")
    public int getPriceForAnotherLaptop(){
        return laptop.laptopPriceSecond;
    }

    @GetMapping("/secondap")
    public String Lip(){
        return name;
    }

}
