package com.individual.community.api.impl;

import com.individual.community.api.TestApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author cl
 */
@Service
public class TestApiImpl implements TestApi {

    private final Logger log = LoggerFactory.getLogger(TestApiImpl.class);

    @Override
    public void test() {
        log.info("测试接口");
    }
}
