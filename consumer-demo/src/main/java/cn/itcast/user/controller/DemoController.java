package cn.itcast.user.controller;

import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/10$
 * @description $
 *
 * 服务调用
 */
@RestController
@RequestMapping("consumer")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    public User getUser(@PathVariable("id")String id ){
        String url = "http://localhost:8081/hello/"+id;
        User user = restTemplate.getForObject(url,User.class);
        return user;
    }
}
