package com.pccc.clps.consumerfeign5001.controller;

import com.pccc.clps.consumerfeign5001.dao.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductFeignClient productFeignClient;

    @RequestMapping(value = "/product/getAll", method = RequestMethod.GET)
    public List getAll() {
        System.out.println("#######");
        List list = productFeignClient.getAll();
        System.out.println("*******");
        return list;
    }

    @RequestMapping(value = "/ribbon/test", method = RequestMethod.GET)
    public String test() {
        String str = productFeignClient.test();
        return str;
    }

}
