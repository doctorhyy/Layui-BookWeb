package com.hy.dao;

import com.hy.entity.User;

import java.util.List;

public interface UserDao {
    int insertUser(User user);
    List<User> selectUsers();
    int updateUser(User user);
    int deleteUser(String id);
    User getUserById(String id);
    User getUserByName(String Name);
}
