package com.xiaohu.springboot_token.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaohu.springboot_token.entity.User;
import com.xiaohu.springboot_token.utils.BaseResponse;
import com.xiaohu.springboot_token.utils.TokenUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {
    @ApiOperation(value = "登录")
    @GetMapping("/login")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "用户名", paramType = "String"),
            @ApiImplicitParam(name = "passWord", value = "密码", paramType = "String")
    })
    public BaseResponse<HashMap> login(@RequestParam(value = "userName") String userName, @RequestParam(value = "passWord") String passWord) throws JsonProcessingException {
        //包装token
        User user = new User();
        user.setUsername(userName);
        user.setPassword(passWord);
        String token= TokenUtils.sign(user);
        HashMap<String,Object> hs=new HashMap<>();
        hs.put("token",token);
        return null;
    }
}
