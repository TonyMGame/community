package com.individual.community.api;

import com.individual.community.bean.input.UserLogin;
import com.individual.community.bean.input.UserRegister;

import javax.servlet.http.HttpServletRequest;

public interface UserApi {

    String login(UserLogin userLogin, HttpServletRequest request);

    void logon(UserRegister userRegister);

    void logout();

}
