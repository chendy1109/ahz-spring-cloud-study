package com.pccc.clps.consumerusertimeout.controller;

import com.pccc.clps.consumerusertimeout.dao.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List getAll(){
        List list = productService.getAll();
        return list;
    }
}
