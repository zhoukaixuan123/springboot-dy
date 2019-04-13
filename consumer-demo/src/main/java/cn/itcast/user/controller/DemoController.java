package cn.itcast.user.controller;

import cn.itcast.user.client.UserClient;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
//@DefaultProperties(defaultFallback = "getUser1")  //
public class DemoController {

    /*@Autowired
    private RestTemplate restTemplate;*/
    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") String id) {

        return userClient.queryById(id);
    }

    //实现解耦
    // @Autowired
    // private RibbonLoadBalancerClient client;
    /*(commandProperties = {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds" ,value="3000")})*/
    /*@GetMapping("{id}")
    @HystrixCommand(commandProperties = {
            //10次 有5次失败就会发生熔断
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold" ,value="10"),
            //休眠秒数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds" ,value="10000"),
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage" ,value="60")
    })
    public String getUser(@PathVariable("id") String id) {
        if(Integer.parseInt(id) % 2 == 0){
              throw  new  RuntimeException("发生熔断");
        }
        String url = "http://user-server/hello/"+id;
        String user = restTemplate.getForObject(url, String.class);
        return user;
    }*/

    //服务降级处理
    public String getUser1() {

        return "服务器正忙";
    }

    /*@GetMapping("{id}")
    public User getUser(@PathVariable("id") String id) {
        //根据服务id获取实例
        *//*List<ServiceInstance> instance =discoveryClient.getInstances("user-server");
        ServiceInstance serviceInstance = instance.get(0);*//*

        //负载均衡  RibbonLoadBalancerClient内部 实现负载均衡算法  默认是轮询
        //ServiceInstance serviceInstance =   client.choose("user-server");
        //得到IP 和端口进行拼接
        // ipPort =serviceInstance.getHost()+":"+serviceInstance.getPort();
        //从实例当中取ip和端口
        // String url = "http://"+ipPort+"/hello/"+id;
        //最终方案
         String url = "http://user-server/hello/"+id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }*/
}
