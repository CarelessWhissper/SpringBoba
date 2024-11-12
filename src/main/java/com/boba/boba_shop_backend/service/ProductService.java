package com.boba.boba_shop_backend.service;

import com.boba.boba_shop_backend.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product updateProduct(Long id,Product product);
    void deleteProductById(Long id);
    Product getProductById(Long id);
    List<Product>getAllProducts();
}
