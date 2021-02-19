package com.pccc.clps.providerdept3002.dao;

import com.pccc.clps.providerdept3002.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
