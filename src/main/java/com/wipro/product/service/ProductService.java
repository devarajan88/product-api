package com.wipro.product.service;

import com.wipro.product.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long productId);

    void saveProduct(Product product);

    Product updateProductById(Product product);

    void deleteProductById(Long productId);
}
