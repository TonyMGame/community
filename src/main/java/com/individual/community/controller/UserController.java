package com.individual.community.controller;


import com.individual.community.api.UserApi;
import com.individual.community.bean.input.UserIndex;
import com.individual.community.bean.input.UserLogin;
import com.individual.community.bean.input.UserRegister;
import com.individual.community.common.Response;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserApi userApi;

    /**
     * 注册
     */
    @RequestMapping(value = "logon", method = RequestMethod.POST)
    @ResponseBody
    public Response logon(@RequestBody UserRegister userRegister) {
        userApi.logon(userRegister);
        return new Response();
    }

    /**
     * 登录
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Response login(@RequestBody UserLogin userLogin, HttpServletRequest request) {
        return new Response(this.userApi.login(userLogin, request));
    }

    /**
     * 登出
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    @ResponseBody
    public Response logout() {
        userApi.logout();
        return new Response();
    }


}
