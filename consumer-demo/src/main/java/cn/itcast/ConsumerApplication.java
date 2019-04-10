package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/10$
 * @description $
 */
@SpringBootApplication
public class ConsumerApplication {

    //远程调用启动
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
