package com.pccc.clps.providerdept3001.controller;


import com.pccc.clps.providerdept3001.dao.ProductMapper;
import com.pccc.clps.providerdept3001.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping()
public class ProductController {

    @Value("${server.port}")
    private String port;
    @Autowired
    private ProductMapper productMapper;

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product getOneById(@PathVariable("id") String id) {
        System.out.println("id: " + id);
        return productMapper.findOneById(id);
    }

    @RequestMapping(value = "/product/getAll", method = RequestMethod.GET)
    public List getAll() {
        List list = productMapper.getAll();
        return list;
    }

    @RequestMapping(value = "/ribbon/test")
    public String test() {
        return "工号【" + port + "】正在为您服务";
    }
}
