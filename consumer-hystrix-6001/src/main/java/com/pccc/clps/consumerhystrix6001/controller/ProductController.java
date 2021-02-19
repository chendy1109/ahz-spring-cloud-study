package com.pccc.clps.consumerhystrix6001.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pccc.clps.consumerhystrix6001.dao.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductFeignClient productFeignClient;

    @RequestMapping(value = "/product/getAll", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "getAllFail")
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

    private List getAllFail(){
        System.out.println("Controller中的降级方法.......");
       /* Map<String,Object> msg = new HashMap<>();
        msg.put("code",-1);
        msg.put("msg","抢购人数太多，您被挤出来了，稍等重试");*/
       List list = new ArrayList();
       list.add(-1);
       list.add("抢购人数太多，您被挤出来了，稍等重试");
       return list;
    }

}
