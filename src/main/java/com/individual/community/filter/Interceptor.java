package com.individual.community.filter;

import com.individual.community.api.impl.TestApiImpl;
import com.individual.community.bean.model.User;
import com.individual.community.common.CachePool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor implements HandlerInterceptor {

    private final Logger log = LoggerFactory.getLogger(Interceptor.class);

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {

        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
        response.setContentType("text/html;charset=UTF-8");
        log.info("------------------>:已完成跨域处理");

        String sessionId = request.getSession().getId();
        log.info("拦截获取sessionId：{}", sessionId);
        CachePool.getInstance().getSize();
        User user = (User) CachePool.getInstance().getCacheItem(sessionId);

        if (user == null) {
            response.getWriter().append("请登录");
            return false;
        }

        return true;
    }

}
