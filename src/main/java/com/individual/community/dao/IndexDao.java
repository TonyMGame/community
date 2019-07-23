package com.individual.community.dao;

import com.individual.community.bean.model.Content;
import com.individual.community.bean.model.Index;
import com.individual.community.bean.model.Storey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexDao {

    List<Index> getIndex();

    List<Storey> getStorey(int indexId);

    Content getConcent(int indexId);

}
