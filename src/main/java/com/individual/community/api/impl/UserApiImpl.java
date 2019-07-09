package com.individual.community.api.impl;

import com.individual.community.api.UserApi;
import com.individual.community.bean.input.UserLogin;
import com.individual.community.bean.model.User;
import com.individual.community.common.CachePool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserApiImpl implements UserApi {

    private final Logger log = LoggerFactory.getLogger(UserApiImpl.class);

    @Override
    public String  login(UserLogin userLogin, HttpServletRequest request) {

        //根据username查出user
        User user = new User();
        user.setName("大白");
        user.setLevel("13");
        user.setPassword("123456");
        user.setUsername("admin");
        user.setSex("1");

        if(user==null){
            return null;
        }
        if(user.getPassword().equalsIgnoreCase(userLogin.getPassword())){
            String sessionId = request.getSession().getId();


            log.info("sessionId为：{} user信息{}",sessionId,user);
            CachePool.getInstance().putCacheItem(sessionId,user,10000);
            return sessionId;
        }
       return null;
    }

}
