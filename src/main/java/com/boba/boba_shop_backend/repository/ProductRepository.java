package com.boba.boba_shop_backend.repository;

import com.boba.boba_shop_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
