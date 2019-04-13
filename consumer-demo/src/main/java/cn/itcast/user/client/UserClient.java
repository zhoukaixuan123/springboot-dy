package cn.itcast.user.client;


import cn.itcast.user.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-server",fallback = UserClientFailBack.class )
public interface UserClient {

   @GetMapping("hello/{id}")
   User queryById(@PathVariable("id") String id );
}
