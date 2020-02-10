package com.xuke.FailureAnalyzer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-09 09:37
 * @Email ：wxk1035@gmail.com
 */

/**
 * 用于测试自定义 FailureAnalyzer，该方式处理不了启动main方法里的异常。
 *操作步骤：
 *     1.继承AbstractFailureAnalyzer类，并指定要实现的异常类型，重写analyze方法，进行自定义操作
 *     2.在src/main/resources/META-INF/spring.factories中注册自定义的异常处理类
 */

/**
 * 当测试自定义加载环境时需将下面错误注释上
 */
@Configuration
public class TestConfig {
    /**
     * 测试IllegalArgumentException用，没有捕获该异常，直接报错
     */
    @Value("${application.name}")
    private String applicationName;


    /**
     * 测试NullPointerFailure异常，没有捕获该异常，直接报错
     */
     public TestConfig(){
         String arg=null;
         System.out.println(arg.toString());
     }
}
