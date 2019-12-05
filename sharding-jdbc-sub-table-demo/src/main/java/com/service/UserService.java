package com.service;

import com.bo.User;

import java.util.List;

/**
 * @author zmf
 * @version 1.0
 * @ClassName UserService
 * @Description: ${todo}
 * @date 2019/12/4 16:13
 */
public interface UserService {
    void insert(User user);

    List<User> getUsers();

    int insertBatch(List<User> list);
}
