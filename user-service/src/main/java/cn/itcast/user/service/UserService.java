package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/10$
 * @description $
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String id){
    return userMapper.selectByPrimaryKey(id);
    }
}
