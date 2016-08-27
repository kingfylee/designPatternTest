package com.create.singletonPattern;

/**
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class StaticNestedClassSingleton {

    /**
     * 内部类分为对象级别（非静态内部类）和类级别（静态内部类）
     * 类级内部类指的是，有static修饰的成员变量的内部类。如果没有static修饰的成员变量的内部类被称为对象级内部类。
     * 类级内部类相当于其外部类的static成员，它的对象与外部类对象间不存在依赖关系，相互独立，因此可直接创建。
     * 而对象级内部类的实例，是必须绑定在外部对象实例上的。
     * --类级内部类只有在第一次被使用的时候才被会装载--
     */
    private static class SingletonHolder {
        private static final StaticNestedClassSingleton INSTANCE = new StaticNestedClassSingleton();
    }

    private StaticNestedClassSingleton() {
    }

    public static final StaticNestedClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
