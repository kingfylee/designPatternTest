package com.code.singletonPattern;

/**
 * Created by Administrator on 2016/8/27 0027.
 */
public class LazyLoadSingleton {

    private static LazyLoadSingleton instance;

    private LazyLoadSingleton() {
    }

    public static LazyLoadSingleton getInstance() {
        if (instance == null) {
            instance = new LazyLoadSingleton();
        }
        return instance;
    }
}
