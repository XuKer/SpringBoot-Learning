package com.xuke.controller;

import com.xuke.config.AppSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-08 09:44
 * @Email ：wxk1035@gmail.com
 */
@RestController
public class DemoController {
    @Autowired
    private AppSetting appSetting;
    @RequestMapping("/")
    public String hello(){

        return "这个APP的介绍是："+appSetting.getDesc()+",它的大小为："+appSetting.getSize();
    }
}
