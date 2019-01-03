package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumberOneDemo {

    @RequestMapping("hello")
    @ResponseBody
    public String hellowDemo(){
        String name = "choudabao";
        String nameTwo = "husen";
        return "哈哈哈哈臭大宝飒飒".concat(name).concat(nameTwo);
    }
}
