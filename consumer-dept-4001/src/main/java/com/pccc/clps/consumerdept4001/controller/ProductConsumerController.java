package com.pccc.clps.consumerdept4001.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductConsumerController {

    private final static String SERVER_IP_PORT = "http://AHZ-PROVIDER-PRODUCT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/getAll", method = RequestMethod.GET)
    public List get() {
        System.out.println("xxxxxxx");
        //return (List) restTemplate.getForObject("http://localhost:3001/product/getAll", List.class);
        return restTemplate.getForObject(SERVER_IP_PORT + "/product/getAll", List.class);
    }
    @RequestMapping(value = "/consumer/test")
    public String test() {
        //ResponseEntity
        return restTemplate.getForObject(SERVER_IP_PORT + "/ribbon/test", String.class);
    }
}
