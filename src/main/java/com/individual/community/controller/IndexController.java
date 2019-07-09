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
public class IndexController {

    @Resource
    private TestApi testApi;

    /**
     *获取首页列表
     * @param userIndex
     * @return
     */
    @RequestMapping(value = "/getIndex", method = RequestMethod.POST)
    @ResponseBody
    public String getIndex(@RequestBody UserIndex userIndex){
        testApi.test();
        return  "访问首页";
    }

    /**
     * 内容详情
     */

    /**
     * 评论
     */

    /**
     * 发表
     */

    /**
     * 删除
     */


    /**
     * 个人中心
     */


}
