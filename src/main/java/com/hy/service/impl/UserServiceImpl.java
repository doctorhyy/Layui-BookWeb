package com.hy.service.impl;

import com.hy.dao.UserDao;
import com.hy.entity.User;
import com.hy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao dao;
    @Override
    public int insertUserService(User user) {
        int nums = dao.insertUser(user);
        return nums;
    }

    @Override
    public List<User> selectUsersService() {
        return dao.selectUsers();
    }

    @Override
    public int updateUserService(User user) {
        return dao.updateUser(user);
    }

    @Override
    public User getUserById(String id) {
        return dao.getUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        return dao.getUserByName(name);
    }

    @Override
    public int deleteUser(String id) {
        return dao.deleteUser(id);
    }

}
