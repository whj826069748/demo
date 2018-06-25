package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello spring boot!";
    }

    @Value("${pageSize}")
    private String pageSize ;
    @Value("${testName}")
    private String testName ;
    @RequestMapping("/showInfo")
    @ResponseBody
    public String showInfo() {
        return "pageSize:"+pageSize+",testName"+testName;
    }


    @Value("${content}")
    private String content ;
    @RequestMapping("/content")
    @ResponseBody
    public String content() {
        return content;
    }


    //templates的展示
    @RequestMapping(value = {"/t","/temp","/template"} ,method = RequestMethod.GET)
    public String showIndexHtml(){
        return "index";
    }


    @RequestMapping(value = {"/showIndex1"} ,method = RequestMethod.GET)
    public String showIndex1(){
        return "/jsp/index1";
    }

}
