package com.mapper;

import com.bo.User;

import java.util.List;

/**
 * @author zmf
 * @version 1.0
 * @ClassName UserMapper
 * @Description: ${todo}
 * @date 2019/12/1 20:54
 */
public interface UserMapper {
    List<User> getAll();

    void insert(User user);

    int insertForeach(List<User> list);

}
