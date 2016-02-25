package com.example.mvptodo.bean;

/**
 * Created by fan on 2016/2/23.
 */
public class TestBean {
    private String name;
    private String msg;

    public TestBean(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public TestBean() {

    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
