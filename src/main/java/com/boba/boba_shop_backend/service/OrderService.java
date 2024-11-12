package com.boba.boba_shop_backend.service;



import com.boba.boba_shop_backend.model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    Order updateOrder(Long id,Order order);
    void deleteOrderById(Long id);
    Order getOrderById(Long id);
    List<Order>getAllOrders();
}
