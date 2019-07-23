package com.individual.community.api.impl;

import com.github.pagehelper.PageHelper;
import com.individual.community.api.IndexApi;
import com.individual.community.bean.input.UserIndex;
import com.individual.community.bean.model.Content;
import com.individual.community.bean.model.Storey;
import com.individual.community.dao.IndexDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexApiImpl implements IndexApi {

    @Resource
    private IndexDao indexDao;

    /**
     * 获取首页列表
     * @param userIndex
     * @return
     */
    @Override
    public List getIndex(UserIndex userIndex) {
        PageHelper.startPage(userIndex.getPageIndex(),userIndex.getPageSize());
        List list = indexDao.getIndex();
        return list;
    }

    /**
     * 获取具体内容及回复
     * @param indexId
     * @return
     */
    @Override
    public Content getContent(Integer indexId) {
        Content content = indexDao.getConcent(indexId);
        List<Storey> storeys = indexDao.getStorey(indexId);
        content.setStorey(storeys);
        return content;
    }
}
