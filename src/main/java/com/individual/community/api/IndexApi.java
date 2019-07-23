package com.individual.community.api;

import com.individual.community.bean.input.UserIndex;
import com.individual.community.bean.model.Content;
import java.util.List;

public interface IndexApi {

    List getIndex(UserIndex userIndex);

    Content getContent(Integer indexId);

}
