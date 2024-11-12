package com.boba.boba_shop_backend.service;

import com.boba.boba_shop_backend.model.User;
import com.boba.boba_shop_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
      return  userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        if(userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);

        }else {
            throw new RuntimeException("User not found");
        }

    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id) .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
