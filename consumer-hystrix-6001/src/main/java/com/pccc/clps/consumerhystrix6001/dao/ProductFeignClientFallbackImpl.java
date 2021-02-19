package com.pccc.clps.consumerhystrix6001.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productFeignClient")
public class ProductFeignClientFallbackImpl implements ProductFeignClient {
    @Override
    public List getAll() {
        System.out.println("ProductFeignClientFallbackImpl中的降级方法。。。。");
        return null;
    }

    @Override
    public String test() {
        return null;
    }
}
