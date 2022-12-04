package com.hspedu.hspliving.commodity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author fraven
 * @Description
 * @Date 2022/12/04/18:26
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
