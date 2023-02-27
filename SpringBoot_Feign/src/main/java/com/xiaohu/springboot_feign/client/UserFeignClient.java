package com.xiaohu.springboot_feign.client;

import com.xiaohu.springboot_feign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVER-POWER")
public interface UserFeignClient {

    @RequestMapping("/power.do")
    public Object power();

}
