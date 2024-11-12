package com.boba.boba_shop_backend.repository;

import com.boba.boba_shop_backend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository  extends JpaRepository<Cart,Long> {
    Optional<Cart> findByUserId(Long userId);
}
