package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/10$
 * @description $
 */
//@EnableCircuitBreaker//熔断  hystix
//@EnableDiscoveryClient //eureka
//@SpringBootApplication
@EnableFeignClients
@SpringCloudApplication  //相当于上面的3个注解
public class ConsumerApplication {

    //远程调用启动
    /*@Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
