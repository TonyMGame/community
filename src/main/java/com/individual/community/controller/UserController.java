package com.individual.community.controller;


import com.individual.community.api.TestApi;
import com.individual.community.bean.input.UserIndex;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author CL
 * @date 2019.07.09
 * @deprecated 启动类
 */
@RestController
public class UserController {

   @Resource
   private TestApi testApi;

   @RequestMapping(value = "/getIndex", method = RequestMethod.POST)
   @ResponseBody
   public String getIndex(@RequestBody UserIndex userIndex){
       testApi.test();
       return  "访问首页";
   }

}
