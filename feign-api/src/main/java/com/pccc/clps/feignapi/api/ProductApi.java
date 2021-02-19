package com.pccc.clps.feignapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ahz-provider-product")
public interface ProductApi {

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    List getAll();

}
