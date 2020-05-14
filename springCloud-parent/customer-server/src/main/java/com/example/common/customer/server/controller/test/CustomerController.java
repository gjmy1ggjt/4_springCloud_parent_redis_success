package com.example.common.customer.server.controller.test;

import com.example.common.customer.server.feign.product.UserService;
import com.example.common.customer.server.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2020/1/22.
 */
@RestController
@RequestMapping(value = "/user")
public class CustomerController {

    @Autowired
    private UserService userService;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") Integer id) {

        return userService.getUserById(id);

    }

    @RequestMapping(value = "/get/{key}", method = RequestMethod.GET)
    public String getRedisByKey(@PathVariable("key") String key) {

        return redisUtil.get(key).toString();

    }
}
