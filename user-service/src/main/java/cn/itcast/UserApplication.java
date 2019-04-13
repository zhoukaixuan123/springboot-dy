package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/9$
 * @description 启动类$
 */
/*t推荐使用这个注解   这个注解支持三种*/
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.itcast.user.mapper")
public class UserApplication {
    public static void main(String[] args) {

            SpringApplication.run(UserApplication.class, args);
    }
}
