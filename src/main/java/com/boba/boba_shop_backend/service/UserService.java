package com.boba.boba_shop_backend.service;

import com.boba.boba_shop_backend.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(Long id,User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    List <User>getAllUsers();
}
