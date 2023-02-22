package com.xiaohu.springboot_jpa.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Person implements Serializable {

    @Id //表示该主键为表的主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设定主键生成策略，IDENTITY表示由数据库自动生成
    private Long id;

    @Column(nullable = false,unique = true,length = 20) //列字段，非空且唯一，字符最大长度20
    private String username;//用户名

    @Column(nullable = false,length = 20) //列字段，非空，字符最大长度20
    private String password;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regdate;   //Date对应MySQL数据库，datetime 类型

}
