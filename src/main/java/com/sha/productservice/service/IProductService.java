package com.sha.productservice.service;

import java.util.List;
import com.sha.productservice.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {

    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
