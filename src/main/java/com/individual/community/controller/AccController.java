package com.individual.community.controller;

import com.individual.community.FeignApi.AccApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccController implements AccApi {

    @Resource
    private AccApi accApiccApi;

    @Override
    public String getAcc(long id) {
        return String.valueOf(id);
    }

    @RequestMapping(value = "/getAcc2/{indexId}", method = RequestMethod.GET)
    @ResponseBody
    public  String getAcc2(long id){
       return accApiccApi.getAcc(id);
    }
}
