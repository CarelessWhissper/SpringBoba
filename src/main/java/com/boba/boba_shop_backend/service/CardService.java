package com.boba.boba_shop_backend.service;


import com.boba.boba_shop_backend.model.Cart;

import java.util.List;

public interface CardService {
    Cart createCart(Cart cart);
    Cart updateCart(Long id,Cart cart);
    void deleteCartById(Long id);
    Cart getCartById(Long id);
    List<Cart>getAllCarts();
}
