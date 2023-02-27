package com.xiaohu.springboot_feign.dao;

import com.xiaohu.springboot_feign.client.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserDao {

    private static final String url = "http://SERVER-POWER";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;


    @RequestMapping("/power.do")
    public Object power(){
        return restTemplate.getForObject(url + "power.do",Object.class);
    }

    @RequestMapping("feignPower.do")
    public Object feignPower(){
        return userFeignClient.power();
    }


}
