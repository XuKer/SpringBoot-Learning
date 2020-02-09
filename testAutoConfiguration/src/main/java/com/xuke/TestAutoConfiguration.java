package com.xuke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-09 20:20
 * @Email ：wxk1035@gmail.com
 */
@Configuration
@EnableConfigurationProperties(TestServiceProperties.class)
@ConditionalOnClass(TestService.class)
@ConditionalOnProperty(prefix = "test",value = "enabled",matchIfMissing = true)
public class TestAutoConfiguration {
    @Autowired
    private TestServiceProperties testServiceProperties;

    @Bean
    @ConditionalOnMissingBean(TestService.class)
    public TestService testService(){
        TestService testService=new TestService();
        testService.setMsg(testServiceProperties.getMsg());
        return testService;
    }
}
