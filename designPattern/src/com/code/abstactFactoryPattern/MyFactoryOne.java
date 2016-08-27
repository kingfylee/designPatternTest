package com.code.abstactFactoryPattern;

/**
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class MyFactoryOne implements Provider {
    @Override
    public MyInterface produce() {
        return new MyClassOne();
    }
}
