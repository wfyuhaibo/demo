package com.yu.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
        return "hello for maclll";
    }
}
