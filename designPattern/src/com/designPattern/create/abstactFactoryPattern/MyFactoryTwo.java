package com.designPattern.create.abstactFactoryPattern;

/**
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class MyFactoryTwo implements Provider {
    @Override
    public MyInterface produce() {
        return new MyClassTwo();
    }
}
