package com.create.prototypePattern;

/**
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class ConcretePrototype extends Prototype {

    private int i;
    private String name;

    public void show() {
        System.out.println("ConcretePrototype!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
