package com.individual.community.dao;


import com.individual.community.bean.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User getUserByName(String userName);

}
