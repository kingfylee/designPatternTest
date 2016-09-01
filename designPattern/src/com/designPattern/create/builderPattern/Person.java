package com.designPattern.create.builderPattern;

/**
 * Product --需要创建的对象，此处以创建一个人为例
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class Person {

    private String head;
    private String body;
    private String foot;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
