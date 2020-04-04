package com.zz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by weizhe.fan on 2020/04/04.
 */
@Controller
@RequestMapping("/demo")
public class demo {

    @GetMapping
    @ResponseBody
    public String demo(){
        return "demo";
    }
}
