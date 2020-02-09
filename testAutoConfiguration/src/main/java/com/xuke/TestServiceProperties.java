package com.xuke;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-09 20:14
 * @Email ：wxk1035@gmail.com
 */
@ConfigurationProperties(prefix = "test")
public class TestServiceProperties {
    private static final String MSG="AutoConfiguration";
    private String msg=MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
