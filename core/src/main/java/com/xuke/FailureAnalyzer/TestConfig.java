package com.xuke.FailureAnalyzer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-09 09:37
 * @Email ：wxk1035@gmail.com
 */

/**
 * 用于测试自定义 FailureAnalyzer
 */
@EnableAutoConfiguration
public class TestConfig {
    @Value("${application.name}")
    private String applicationName;

}
