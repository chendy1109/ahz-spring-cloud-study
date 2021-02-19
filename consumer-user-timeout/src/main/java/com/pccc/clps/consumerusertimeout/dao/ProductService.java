package com.pccc.clps.consumerusertimeout.dao;

import com.pccc.clps.consumerusertimeout.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ProductService {
    List<Product> getAll();
}
