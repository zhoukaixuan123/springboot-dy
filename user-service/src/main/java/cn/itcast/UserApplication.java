package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/9$
 * @description 启动类$
 */
@SpringBootApplication
@MapperScan("cn.itcast.user.mapper")
public class UserApplication {
    public static void main(String[] args) {

            SpringApplication.run(UserApplication.class, args);
    }
}
