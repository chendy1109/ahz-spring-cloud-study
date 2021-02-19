package com.pccc.clps.providerdept3001.dao;

import com.pccc.clps.providerdept3001.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Mapper
@Repository("productMapper")
public interface ProductMapper {
    List<Product> findProductByName(@Param("name") String name);

    List<Product> findProductByType(@Param("type") int type);

    Product findOneById(String id);

    void insert(Product product);

    void update(Product product);

    void delete(String id);

    List<Product> getAll();
}
