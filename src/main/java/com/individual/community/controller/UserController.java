package com.individual.community.controller;


import com.individual.community.api.UserApi;
import com.individual.community.bean.input.UserIndex;
import com.individual.community.bean.input.UserLogin;
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
    public String logon(@RequestBody UserIndex userIndex){
        return  "注册";
    }

    /**
     * 登录
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody UserLogin userLogin, HttpServletRequest request){
        return this.userApi.login(userLogin,request);
    }

    /**
     * 登出
     */
    @RequestMapping(value = "logout", method = RequestMethod.POST)
    @ResponseBody
    public String logout(@RequestBody UserIndex userIndex){
        return  "登出";
    }



}
