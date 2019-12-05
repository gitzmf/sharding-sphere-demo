package com.controller;

import com.bo.User;
import com.enums.UserSexEnum;
import com.google.common.collect.Lists;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author zmf
 * @version 1.0
 * @ClassName UserController
 * @Description: 控制层
 * @date 2019/12/1 20:54
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * 模拟插入数据
     */
    List<User> userList = Lists.newArrayList();
    /**
     * 初始化插入数据
     */
    @PostConstruct
    private void getData() {
        userList.add(new User(1L,1L,1L,"小小", "zmf","root", UserSexEnum.MAN));
        userList.add(new User(2L,2L,2L,"爸爸", "zmf","root", UserSexEnum.MAN));
        userList.add(new User(3L,3L,3L,"妈妈", "zmf","root", UserSexEnum.MAN));
        userList.add(new User(4L,4L,4L,"爷爷", "zmf","root", UserSexEnum.MAN));
        userList.add(new User(5L,5L,5L,"奶奶", "zmf","root", UserSexEnum.MAN));
    }

    @GetMapping(value="/addUsers")
    public String updateTransactional(@RequestParam(value = "id", required =false) Long id,
                                      @RequestParam(value = "user_id", required =false) Long user_id,
                                      @RequestParam(value = "order_id", required =false) Long order_id,
                                      @RequestParam(value = "nickName", required =false) String nickName,
                                      @RequestParam(value = "passWord", required =false) String passWord,
                                      @RequestParam(value = "userName", required =false) String userName) {
        User user = new User();
        user.setId(id);
        user.setUserId(user_id);
        user.setOrderId(order_id);
        user.setNickName(nickName);
        user.setPassWord(passWord);
        user.setUserName(userName);
        user.setUserSex(UserSexEnum.MAN);
        userService.insert(userList.get(0));
        return "success";
    }

    @GetMapping("/addBatchUsers")
    public int addUserInfos(){
        return userService.insertBatch(userList);
    }

    @GetMapping("/getUsers")
    public List<User> getUserInfos(){
        return userService.getUsers();
    }
}
