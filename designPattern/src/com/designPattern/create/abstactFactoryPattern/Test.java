package com.designPattern.create.abstactFactoryPattern;

/**
 * Created by Administrator on 2016/8/27 0027.
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new MyFactoryOne();
        MyInterface one = provider.produce();
        one.print();
    }
}
