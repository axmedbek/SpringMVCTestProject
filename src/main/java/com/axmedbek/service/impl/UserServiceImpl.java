package com.axmedbek.service.impl;

import com.axmedbek.dao.UserDao;
import com.axmedbek.model.User;
import com.axmedbek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @SuppressWarnings("unchecked")
    @Transactional
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    public User findUserById(int id) {
        return userDao.getUserById(id);
    }

    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
