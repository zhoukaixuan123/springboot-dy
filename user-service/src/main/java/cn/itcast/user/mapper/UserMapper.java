package cn.itcast.user.mapper;

import cn.itcast.user.pojo.User;

import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/10$
 * @description $
 */
@Component
public interface UserMapper extends Mapper<User> {
}
