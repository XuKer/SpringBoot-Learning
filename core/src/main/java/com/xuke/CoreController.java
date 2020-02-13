package com.xuke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-08 09:43
 * @Email ：wxk1035@gmail.com
 */
@SpringBootApplication
public class CoreController {
    public static void main(String[] args) {
        SpringApplication.run(CoreController.class,args);
        ConfigurableApplicationContext ac = SpringApplication.run(CoreController.class, args);
        ConfigurableEnvironment environment = ac.getEnvironment();
        System.out.println("server.port:" + environment.getProperty("server.port"));
        System.out.println("yaml.server.port:" + environment.getProperty("yaml.server.port"));
    }

}
