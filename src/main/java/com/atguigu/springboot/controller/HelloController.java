package com.atguigu.springboot.controller;


import com.atguigu.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    //处理的是什么请求
    public  String hello(@RequestParam("user") String user){
        if(user.equals("utils")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }

    //查出用户数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users",Arrays.asList("zhangsan","lisi","wangwu"));
        //把这两个map的数据传到XMLHttpRequest里面
        return "success";
    }



}
