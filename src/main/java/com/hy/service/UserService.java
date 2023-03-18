package com.hy.service;

import com.hy.entity.User;

import java.util.List;

public interface UserService {
    int insertUserService(User user);
    List<User> selectUsersService();
    int updateUserService(User user);
    User getUserById(String id);
    User getUserByName(String name);
    int deleteUser(String id);
}
