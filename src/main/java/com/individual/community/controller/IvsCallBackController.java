package com.individual.community.controller;


import com.alibaba.fastjson.JSONObject;
import com.individual.community.common.Response;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ivs")
public class IvsCallBackController {

    @RequestMapping(value = "back")
    @ResponseBody
    public Response back(@RequestBody JSONObject jsonParam) {
        System.out.println( jsonParam.get("thirdField"));
        System.out.println(jsonParam.toJSONString());

        String key = null;

        Map<String, Object> thirdField = (Map<String, Object>) jsonParam.get("thirdField");
        Map<String, Object> commonInfo = (Map<String, Object>) jsonParam.get("commonInfo");
        Map<String, Object> privateInfo = (Map<String, Object>) jsonParam.get("privateInfo");

        Map<String, Object> pic = (Map<String, Object>) privateInfo.get("pic");

        String key1 = pic.get("latitude").toString();
        String key2 = pic.get("longitude").toString();
        key = key1+key2;

        Map<String, Object> common = new HashMap<>();
        common.put("thirdField",thirdField);
        common.put("blacklistId",commonInfo.get("blacklistId"));
        common.put("blkgrpId",commonInfo.get("blkgrpId"));
        System.out.println(common);
        return new Response(1);
    }

    @RequestMapping(value = "call")
    @ResponseBody
    public Response call(HttpServletRequest request) {
        JSONObject jsonParam = this.getJSONParam(request);
        System.out.println(jsonParam.toJSONString());



        return new Response(1);
    }



    public JSONObject getJSONParam(HttpServletRequest request){
        JSONObject jsonParam = null;
        try {
            // 获取输入流
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));

            // 写入数据到Stringbuilder
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = streamReader.readLine()) != null) {
                sb.append(line);
            }
            jsonParam = JSONObject.parseObject(sb.toString());


            // 直接将json信息打印出来
            System.out.println(jsonParam.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonParam;
    }


}
