package com.xiaohu.springboot_thread.controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaohu.springboot_thread.server.AsyncServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
@CrossOrigin(value = "*",maxAge = 3600)
public class AsyncController {

    @Autowired
    private AsyncServer server;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public JSONObject asyncTest() throws InterruptedException {
        JSONObject output = new JSONObject();
        long startTime = System.currentTimeMillis();
        int counter = 10;
        for (int i = 0; i < counter; i++) {
            server.asyncTest(i);
        }
        long endTime = System.currentTimeMillis();
        output.put("msg","succeed");
        output.put("花费时间",endTime-startTime);
        return output;
    }

}
