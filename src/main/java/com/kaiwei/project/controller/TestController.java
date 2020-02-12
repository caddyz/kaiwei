package com.kaiwei.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: project
 * @Package: com.kaiwei.project.controller
 * @ClassName: TestController
 * @Author: Kaiser
 * @Description:
 * @Date: 2020/2/12 5:27 下午
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "successful";
    }
}
