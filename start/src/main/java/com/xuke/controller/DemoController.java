package com.xuke.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-07 20:51
 * @Email ：wxk1035@gmail.com
 */
@RestController
public class DemoController {
    @RequestMapping("/")
    public String hello(){
        return "Hello SpringBoot!";
    }
}
