package com.mapper;

import com.bo.User;

import java.util.List;

/**
 * @author zmf
 * @version 1.0
 * @ClassName UserMapper
 * @Description:  用户的Mapper接口
 * @date 2019/12/4 16:07
 */
public interface UserMapper {
    List<User> getAll();

    void insert(User user);

    int insertForeach(List<User> list);
}
