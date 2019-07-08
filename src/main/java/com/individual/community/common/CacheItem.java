package com.individual.community.common;

import lombok.Data;

import java.util.Date;

/**
 * 缓存实体
 * @author cl
 */
@Data
public class CacheItem {

    // 创建缓存时间
    private Date createTime = new Date();

    // 缓存期满时间
    private long expireTime = 1;

    // 缓存实体
    private Object entity;

    public CacheItem(Object obj, long expires) {
        this.entity = obj;
        this.expireTime = expires;
    }

    // 判断缓存是否超时
    public boolean isExpired() {
        return (expireTime != -1 && System.currentTimeMillis() - createTime.getTime() > expireTime);
    }
}

