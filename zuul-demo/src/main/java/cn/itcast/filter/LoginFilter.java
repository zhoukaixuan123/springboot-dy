package cn.itcast.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/*
 *功能描述
 * @author zhoukx
 * @date 2019/4/13$
 * @description 自定义过滤器$
 */
@Component
public class LoginFilter extends ZuulFilter {
   //类型
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }
    //顺序
    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    //要不要拦截
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //业务逻辑
    @Override
    public Object run() throws ZuulException {
        //获取请求的上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        //获取request对象
        HttpServletRequest request = ctx.getRequest();
         //获取对象中是否存在 某个
        String token = request.getParameter("access-token");
        if(StringUtils.isBlank(token)){
            //不存在 ，未登录进行拦截
            ctx. setSendZuulResponse(false);
            ctx.setResponseStatusCode(HttpStatus.SC_FORBIDDEN);
        }
        return null;
    }
}
