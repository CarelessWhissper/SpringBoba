package com.boba.boba_shop_backend.repository;

import com.boba.boba_shop_backend.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
