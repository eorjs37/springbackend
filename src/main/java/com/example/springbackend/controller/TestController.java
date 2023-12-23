package com.example.springbackend.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class TestController {
    @ResponseBody
    @RequestMapping(value =  "/")
    public String helloWorld(){
        return  "1233";
    }

    @ResponseBody
    @RequestMapping(value =  "/test")
    public String helloWorld2(){
        log.info("Call test path");
        return  "1233";
    }
}
