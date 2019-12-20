package com.individual.community.api.impl;

import com.individual.community.api.PayApi;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("aliPay")
public class Pay2Impl implements PayApi {
    @Override
    public Object pay(Map<String, Object> map) {
        return 1;
    }
}
