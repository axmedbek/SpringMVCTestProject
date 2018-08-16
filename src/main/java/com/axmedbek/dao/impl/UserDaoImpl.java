package com.axmedbek.dao.impl;

import com.axmedbek.dao.UserDao;
import com.axmedbek.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<User> getAllUser() {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        List<User> userList = session.createQuery("from User").list();
        tr.commit();
        return userList;
    }

    public void saveUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        session.save(user);
        tr.commit();
    }

    public void updateUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        session.update(user);
        tr.commit();
    }

    public User getUserById(int id) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        User user = (User) session.get(User.class,new Integer(id));
        tr.commit();
        return user;
    }

    public void deleteUser(int id) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        User user = (User) session.get(User.class,new Integer(id));
        session.delete(user);
        tr.commit();
    }
}
