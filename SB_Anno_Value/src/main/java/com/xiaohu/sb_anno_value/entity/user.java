package com.xiaohu.sb_anno_value.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

@RestController
public class user {

    @Value("normal11111")
    private String normal;

    @Value("${book.name}")
    private String name;

    @Value("${tools}")
    private String[] tools;


//    @Value("#{systemProperties['os.name']}")
//    private String systemPropertiesName; // 注入操作系统属性


    @GetMapping("/hello")
    public void getproperties(){
        System.out.println(normal);
        System.out.println(name);
        System.out.println(Arrays.toString(tools));
    }

}
