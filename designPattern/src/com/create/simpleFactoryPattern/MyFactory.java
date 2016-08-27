package com.create.simpleFactoryPattern;

/**
 * Created by Administrator on 2016/8/25 0025.
 */
public class MyFactory {

    public MyInterface factory(String type) {
        if ("one".equals(type)) {
            return new MyClassOne();
        } else if ("two".equals(type)) {
            return new MyClassTwo();
        } else {
            System.out.println("nothing!!");
            return null;
        }
    }

}
