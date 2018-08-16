package com.axmedbek.service;

import com.axmedbek.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void saveUser(User user);
    void updateUser(User user);
    User findUserById(int id);
    void deleteUser(int id);
}
