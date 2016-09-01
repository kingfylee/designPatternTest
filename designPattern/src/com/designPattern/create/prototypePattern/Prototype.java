package com.designPattern.create.prototypePattern;

import java.io.*;

/**
 * 通过拷贝创建新的对象
 *
 * 实现Cloneable接口。
 *      Cloneable接口，它的作用只有一个，就是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。
 *      在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。
 *
 * 重写Object类中的clone方法。
 *       clone方法是Object类的一个方法，作用是返回对象的一个拷贝，但是其作用域protected类型的，一般的类无法调用，
 *      因此，Prototype类需要将clone方法的作用域修改为public类型。
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class Prototype implements Cloneable, Serializable{

    /**
     * 深拷贝与浅拷贝。
     * Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。
     * 如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。
     */
    public Prototype clone() throws CloneNotSupportedException {
        Prototype p = (Prototype) super.clone();
//        p.list = (ArrayList) this.list.clone();
        return p;
    }

    /**
     * 通过流来实现深拷贝
     */
    public Prototype deepClone() throws IOException, ClassNotFoundException {

        /* 写出当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读进二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        bos.close();
        oos.close();
        bis.close();
        ois.close();
        return (Prototype) ois.readObject();
    }

}