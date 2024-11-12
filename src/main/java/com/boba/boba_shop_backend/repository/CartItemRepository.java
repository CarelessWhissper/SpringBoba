package com.boba.boba_shop_backend.repository;

import com.boba.boba_shop_backend.model.CardItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CardItem,Long> {

}
