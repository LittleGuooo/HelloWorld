package com.xu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public String hello(HttpServletRequest httpServletRequest){
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        System.out.println("当前访问路径：" + requestURL);
        return "Hello, World!";
    }
}
