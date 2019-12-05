package com.service.impl;

import com.bo.User;
import com.mapper.UserMapper;
import com.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zmf
 * @version 1.0
 * @ClassName UserServiceImpl
 * @Description: ${todo}
 * @date 2019/12/1 21:48
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> getUsers(){
        return userMapper.getAll();
    }

    @Override
    public int insertBatch(List<User> list) {
        return userMapper.insertForeach(list);
    }
}
