package com.individual.community.bean.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Content {

    private int id;

    private  String tittle;

    private  String summary;

    private  String cover;

    private  String author;

    private Date createTime;

    private List<Storey> storey;

}
