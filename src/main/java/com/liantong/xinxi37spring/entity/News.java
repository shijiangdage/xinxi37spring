package com.liantong.xinxi37spring.entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
    <!--<scope>runtime</scope>-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <!--<dependency>
-->

# 编辑:石彦伟 
 # NAME：NewsController - USER：Administrator - 
 # TIME：2019/5/31- 9:04 - com.liantong.xinxi37spring.controller - 
 # xinxi37spring -the name of the current project
 # 星期五 -full name of the current day. Example: Monday, Tuesday, etc.

*/
//@Controller//模板对饮的路径
//@RestController 更好支持前后端的开发。就是后端给前端服务。。。
//@RestController
//@RequestMapping(value = "news")
public class News {

    private Integer id;
    private String title;
    private String content;

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public News(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public News() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


