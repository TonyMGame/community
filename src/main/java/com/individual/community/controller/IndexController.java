package com.individual.community.controller;


import com.individual.community.api.TestApi;
import com.individual.community.bean.input.CarInfo;
import com.individual.community.bean.input.UserIndex;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
     * 获取首页列表
     *
     * @param userIndex
     * @return
     */
    @RequestMapping(value = "/getIndex", method = RequestMethod.POST)
    @ResponseBody
    public String getIndex(@RequestBody UserIndex userIndex) {
        testApi.test();
        return "访问首页";
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


    /**
     * 模拟接口
     *
     * @param carInfo
     * @return
     */
    /*@RequestMapping(value = "jkfw/dwjk/getCzjbxx", method = RequestMethod.POST)
    @ResponseBody
    public Map test(@RequestBody CarInfo carInfo) {
        System.out.println(carInfo.getCphm());
        System.out.println(carInfo.getHpzl());
        Map map1 = new HashMap();
        map1.put("Msg", "访问正常");
        map1.put("MsgCode", 1);
        List list = new ArrayList();
        Map map2 = new HashMap(){
            {put("CSYS", "车身颜色");}
            {put("HPZL", "号牌种类");}
            {put("HPHM", "车牌号码");}
            {put("SYR", "所有人");}
            {put("CLPP", "车辆品牌");}
            {put("SFZHM", "身份证号码");}
        };

        list.add(map2);
        map1.put("Data", list);
        return map1;
    }*/


}
