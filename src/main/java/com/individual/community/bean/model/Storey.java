package com.individual.community.bean.model;

import lombok.Data;

import java.util.Date;

@Data
public class Storey {

    private   int id;

    private  int indexId;

    private  String content;

    private  int userId;

    private  String userName;

    private Date createTime;

    private  int talkUserId;

    private  String talkUserName;

    private int talkStoreyId;

}
