package com.boba.boba_shop_backend.service;


import com.boba.boba_shop_backend.model.Cart;
import com.boba.boba_shop_backend.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CardService{

    private final CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Long id, Cart cart) {
        if(cartRepository.existsById(id)){
            cart.setId(id);
            return cartRepository.save(cart);
        }else {
            throw new RuntimeException("Cart not found");
        }
    }

    @Override
    public void deleteCartById(Long id) {
             cartRepository.deleteById(id);
    }

    @Override
    public Cart getCartById(Long id) {
        return cartRepository.findById(id).orElseThrow(()->new RuntimeException("Cart not found"));
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }
}
