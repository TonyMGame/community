package com.individual.community.api.impl;

import com.individual.community.api.UserApi;
import com.individual.community.bean.input.UserLogin;
import com.individual.community.bean.input.UserRegister;
import com.individual.community.bean.model.User;
import com.individual.community.common.CachePool;
import com.individual.community.common.ThreadRepertory;
import com.individual.community.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Service
public class UserApiImpl implements UserApi {

    @Resource
    private UserDao userDao;

    private final Logger log = LoggerFactory.getLogger(UserApiImpl.class);

    /**
     * 登录
     * @param userLogin
     * @param request
     * @return
     */
    @Override
    public String login(UserLogin userLogin, HttpServletRequest request) {

        //根据username查出user
        User user = userDao.getUserByName(userLogin.getUsername());
        log.info(user.toString());

        if (user == null) {
            return null;
        }
        if (user.getPassword().equalsIgnoreCase(userLogin.getPassword())) {
            String sessionId = request.getSession().getId();
            log.info("sessionId为：{} user信息{}", sessionId, user);
            CachePool.getInstance().putCacheItem(sessionId, user, 10000);
            return sessionId;
        }
        return null;
    }

    /**
     * 注册
     * @param userRegister
     */
    @Override
    public void logon(UserRegister userRegister) {

    }

    /**
     * 登出
     */
    @Override
    public void logout() {
        Map user = ThreadRepertory.getParm();
        String sessionId = String.valueOf(user.get("sessionId"));
        CachePool.getInstance().removeCacheItem(sessionId);
    }

}
