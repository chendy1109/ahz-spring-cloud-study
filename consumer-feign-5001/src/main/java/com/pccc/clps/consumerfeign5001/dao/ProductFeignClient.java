package com.pccc.clps.consumerfeign5001.dao;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ahz-provider-product")
public interface ProductFeignClient {
    @RequestMapping(value = "/product/getAll", method = RequestMethod.GET)
    List getAll();

    @RequestMapping(value = "/ribbon/test")
    String test();


}
