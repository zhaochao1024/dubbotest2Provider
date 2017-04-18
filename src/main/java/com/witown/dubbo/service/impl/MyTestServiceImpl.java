package com.witown.dubbo.service.impl;

import com.alibaba.dubbo.cache.Cache;
import com.witown.dubbo.service.MyTestService;

/**
 * Created by treebear on 2016/9/19.
 */

public class MyTestServiceImpl implements MyTestService {
    @Override
    public String sayHello() {
        System.out.println("hello world");
        return  "welcome";
    }

    Cache cache = new Cache() {
        @Override
        public void put(Object o, Object o1) {

        }

        @Override
        public Object get(Object o) {
            return null;
        }
    };
}
