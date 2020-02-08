package com.xuke.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-08 09:35
 * @Email ：wxk1035@gmail.com
 */
@Component
@ConfigurationProperties(prefix = "app")
public class AppSetting {
    private String desc;
    private String size;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
