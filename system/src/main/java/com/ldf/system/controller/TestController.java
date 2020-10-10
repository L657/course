package com.ldf.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dunfan liao
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
