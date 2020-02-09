package com.xuke;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-09 20:17
 * @Email ：wxk1035@gmail.com
 */
public class TestService {
    private String msg;
    public String say(){
        return "Test"+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
