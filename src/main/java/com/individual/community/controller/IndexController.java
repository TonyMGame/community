package com.individual.community.controller;


import com.individual.community.api.IndexApi;
import com.individual.community.bean.input.UserIndex;
import com.individual.community.bean.model.Content;
import com.individual.community.common.Response;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author CL
 * @date 2019.07.16
 * @deprecated 首页
 */
@RestController
public class IndexController {

    @Resource
    private IndexApi indexApi;

    /**
     * 获取首页列表
     *
     * @param userIndex
     * @return
     */
    @RequestMapping(value = "/getIndex", method = RequestMethod.POST)
    @ResponseBody
    public Response getIndex(@RequestBody UserIndex userIndex) {
        return  new Response(indexApi.getIndex(userIndex));
    }


    /**
     * 模拟接口
     *
     * @param
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

    /*@RequestMapping(value = "/kingyea-dataservice-cunsumer-web/data/query/{parm}", method = RequestMethod.GET)
    @ResponseBody
    public Map test11(@PathVariable("parm") String parm,
                      HttpServletRequest request) {
        System.out.println("1:"+parm);
        System.out.println();

        Map map1 = new HashMap();
        map1.put("success", true);


        List list = new ArrayList();
        Map map2 = new HashMap(){
            {put("fzjg", "赣B");}
            {put("lxdh", "000000000000");}
            {put("gl", 103.0);}
            {put("zt_dic", "正常");}
            {put("zzxxdz", "江西省赣州市南康区锦绣城5栋1单元702");}
            {put("hpzl", "02");}
            {put("clsbdh", "LGXC16DG891096667");}
            {put("clpp1", "比亚迪牌");}
            {put("syr", "钟春华");}
            {put("sfzmmc", "A");}
            {put("fdjxh", "BYD483QB");}
            {put("ccrq", 1255708800);}
            {put("fdjh", "209027799");}
            {put("zsxxdz", "江西省南康市唐江镇村尾村岔路口25号");}
            {put("ccdjrq", 1259307409);}
            {put("csys_dic", "黑");}
            {put("dybj_dic", "未抵押");}
            {put("hdzzl", "");}
            {put("hpzl_dic", "小型汽车");}
            {put("pl", 1991);}
            {put("hphm", "B0R886");}
            {put("hdzk", 5);}
            {put("rlzl_dic", "汽油");}
        };
        list.add(map2);
        map1.put("result", list);
        return map1;
    }*/


}
