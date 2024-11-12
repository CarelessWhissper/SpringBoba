package com.boba.boba_shop_backend.service;


import com.boba.boba_shop_backend.model.OrderItem;
import com.boba.boba_shop_backend.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;


    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository){
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public OrderItem updateOrderItem(Long id, OrderItem orderItem) {
        if(orderItemRepository.existsById(id)){
            orderItem.setId(id);
            return orderItemRepository.save(orderItem);

        }else{
            throw new RuntimeException("OrderItem not found");
        }
    }

    @Override
    public void deleteOrderItemById(Long id) {

    }

    @Override
    public OrderItem getOrderItemById(Long id) {
        return null;
    }

    @Override
    public List<OrderItem> getAllOrderItem() {
        return null;
    }
}
