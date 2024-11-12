package com.boba.boba_shop_backend.service;



import com.boba.boba_shop_backend.model.Order;
import com.boba.boba_shop_backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        return  orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order order) {
        if(orderRepository.existsById(id)){
            order.setId(id);
            return orderRepository.save(order);
        }else{
            throw new RuntimeException("Order not found");
        }
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order not found"));
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
