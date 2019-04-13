package cn.itcast.user.client;

import cn.itcast.user.pojo.User;
import org.springframework.stereotype.Component;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/13$
 * @description $
 */
@Component
public class UserClientFailBack implements UserClient {
    @Override
    public User queryById(String id) {
        User user = new User();
        user.setUser_name("为知道到用户");
        return user;
    }
}
