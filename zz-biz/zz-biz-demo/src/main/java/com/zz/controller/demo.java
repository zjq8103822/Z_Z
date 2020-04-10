package com.zz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by weizhe.fan on 2020/04/04.
 */
@Controller
@RequestMapping("/demo")
public class demo {

    @GetMapping("/test/{param}")
    @ResponseBody
    public String helloWorld(@PathVariable String param){
        System.out.println(param);
        return param;
    }
}
