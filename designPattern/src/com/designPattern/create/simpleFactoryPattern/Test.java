package com.designPattern.create.simpleFactoryPattern;

/**
 * Created by Administrator on 2016/8/25 0025.
 */
public class Test {

    public static void main(String[] args) {
        MyFactory myFactory = new MyFactory();
        MyInterface myInterface = myFactory.factory("one");
        myInterface.print();
    }

}
