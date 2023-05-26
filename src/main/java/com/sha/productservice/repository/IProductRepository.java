package com.sha.productservice.repository;

import com.sha.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProductRepository extends JpaRepository<Product,Long> {

}

//    @Query("select * from Product where createTime ")
//    Product findByPriceGreaterThan();