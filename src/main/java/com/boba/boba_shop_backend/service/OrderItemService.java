package com.boba.boba_shop_backend.service;


import com.boba.boba_shop_backend.model.OrderItem;

import java.util.List;
public interface OrderItemService {
    OrderItem createOrderItem(OrderItem orderItem);
    OrderItem updateOrderItem(Long id,OrderItem orderItem);
    void deleteOrderItemById(Long id);
    OrderItem getOrderItemById(Long id);
    List<OrderItem>getAllOrderItem();
}
