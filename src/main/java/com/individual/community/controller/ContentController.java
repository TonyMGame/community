package com.individual.community.controller;

import com.individual.community.api.IndexApi;
import com.individual.community.bean.model.Content;
import com.individual.community.common.Response;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author CL
 * @date 2019.07.16
 * @deprecated 内容
 */
@RestController
public class ContentController {

    @Resource
    private IndexApi indexApi;

    /**
     * 内容详情及留言
     *
     * @param indexId
     * @return
     */
    @RequestMapping(value = "/getContent/{indexId}", method = RequestMethod.GET)
    @ResponseBody
    public Response getContent(@PathVariable("indexId") Integer indexId) {
        return new Response(indexApi.getContent(indexId));
    }

    /**
     * 评论
     */

    /**
     * 发表
     */

    /**
     * 删除
     */


}
