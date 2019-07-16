package com.individual.community;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author CL
 * @date 2019.07.09
 * @deprecated 启动类
 */
@SpringBootApplication
public class CommunityApplication {

	private final Logger log = LoggerFactory.getLogger(CommunityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
		new CommunityApplication().logUtil();
    }

	public void logUtil(){
		log.info("启动成功");
	}



}
