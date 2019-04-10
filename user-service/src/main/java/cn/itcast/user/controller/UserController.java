package cn.itcast.user.controller;

import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/10$
 * @description $
 */
@RestController
@RequestMapping("/hello")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
     public User getString(@PathVariable("id") String id ){
         return  userService.getUser(id);
     }
}
