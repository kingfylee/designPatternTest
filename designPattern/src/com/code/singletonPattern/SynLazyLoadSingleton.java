package com.code.singletonPattern;

/**
 * Created by Administrator on 2016/8/27 0027.
 */
public class SynLazyLoadSingleton {

    private static SynLazyLoadSingleton instance;

    private SynLazyLoadSingleton() {
    }

    public static synchronized SynLazyLoadSingleton getInstance() {
        if (instance == null) {
            instance = new SynLazyLoadSingleton();
        }
        return instance;
    }
}
