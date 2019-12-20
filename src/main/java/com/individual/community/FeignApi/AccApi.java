package com.individual.community.FeignApi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface AccApi {

    @RequestMapping(method = RequestMethod.GET, value ="/users/{id}")
    String getAcc(@PathVariable("id") long id);

}
