package com.designPattern.create.singletonPattern;

/**
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class HungrySingleton {

    /*
    非懒加载模式，如果实例的创建需要依赖参数或者配置文件时，就不能这样写；
     */
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
