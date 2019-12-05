package com.bo;

import com.enums.UserSexEnum;
import lombok.Data;

/**
 * @author zmf
 * @version 1.0
 * @ClassName User
 * @Description: ${todo}
 * @date 2019/12/4 16:05
 */
@Data
public class User {
    private Long id;
    private Long orderId;
    private Long userId;
    private String userName;
    private String passWord;
    private String nickName;
    private UserSexEnum userSex;

    public User() {
    }

    public User(Long id, Long orderId, Long userId, String userName, String passWord, String nickName, UserSexEnum userSex) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.nickName = nickName;
        this.userSex = userSex;
    }
}
