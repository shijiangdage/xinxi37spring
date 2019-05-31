package com.liantong.xinxi37spring.controller;

import com.liantong.xinxi37spring.entity.News;
import org.springframework.stereotype.Controller;
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
@RestController
@RequestMapping(value = "news")
public class NewsController {

    // http://127.0.0.1:8080/news/getAll
    @RequestMapping(value = "getAll")
    public List<News> getAll(){
        List<News> list=new ArrayList<>();
        News news1=new News(11,"aa11","aaaa11");
        News news2=new News(12,"aa12","aaaa12");
        News news3=new News(13,"aa12","aaaa13");
        News news4=new News(14,"aa14","aaaa14");
        News news5=new News(15,"aa15","aaaa15");
        News news6=new News(16,"aa16","aaaa16");

        list.add(news1);
        list.add(news2);
        list.add(news3);
        list.add(news4);
        list.add(news5);
        list.add(news6);
        return list;

    }
    //接口测试//  http://127.0.0.1:8080/news/getAll
    //接口测试//  http://127.0.0.1:8080/news/getAll
    //接口测试//  http://127.0.0.1:8080/news/getAll
    //接口测试//  http://127.0.0.1:8080/news/getAll



    // http://127.0.0.1:8080/news/hello
    @RequestMapping(value = "")
    public List tes1(){
        List list=new ArrayList();
        list.add("news");
        list.add("hello");
        list.add("test0");
        return list;
    }

    // http://127.0.0.1:8080/news/hello
    @RequestMapping(value = "hello")
    public List tes0(){
        List list=new ArrayList();
        list.add("news");
        list.add("hello");
        list.add("test0");
        return list;
    }



}


