package com.axmedbek.dao;

import com.axmedbek.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();
    void saveUser(User user);
    void updateUser(User user);
    User getUserById(int id);
    void deleteUser(int id);
}
