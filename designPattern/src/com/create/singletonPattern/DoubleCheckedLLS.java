package com.create.singletonPattern;

/**
 *
 * Created by Administrator on 2016/8/27 0027.
 */

public class DoubleCheckedLLS {

    /*
    由于 instance = new DoubleCheckedLLS; 并非一个原子操作，
    所以此处可以添加关键词 volatile
        --其作用是禁止指令重排序优化

    （适用于Java所有版本）读和写一个volatile变量有全局的排序。
            也就是说每个线程访问一个volatile作用域时会在继续执行之前读取它的当前值，
            而不是（可能）使用一个缓存的值。(但是并不保证经常读写volatile作用域时读和写的相对顺序，
            也就是说通常这并不是有用的线程构建)。
    （适用于Java5及其之后的版本）volatile的读和写建立了一个happens-before关系，类似于申请和释放一个互斥锁。
     */
    private volatile static DoubleCheckedLLS instance;

    private DoubleCheckedLLS() {
    }

    public static DoubleCheckedLLS getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLLS.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLLS();
                }
            }
        }
        return instance;
    }
}
