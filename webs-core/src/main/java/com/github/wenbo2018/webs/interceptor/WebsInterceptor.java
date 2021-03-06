package com.github.wenbo2018.webs.interceptor;

import com.github.wenbo2018.webs.context.ApplicationContext;
import com.github.wenbo2018.webs.context.WebsWebApplicationContext;

import java.util.List;

/**
 * Created by shenwenbo on 2017/4/9.
 */
public interface WebsInterceptor {

    List<HandlerInterceptor> getInterceptor();

    void init(WebsWebApplicationContext websWebApplicationContext) throws IllegalAccessException, InstantiationException;
}
