package com.create.prototypePattern;

import java.io.IOException;

/**
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class Test {

   public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
       ConcretePrototype cp1 = new ConcretePrototype();
       cp1.setI(1);
       cp1.setName("Da");
       ConcretePrototype cp2 = (ConcretePrototype) cp1.clone();
       System.out.println(cp1.getName() == cp2.getName()); //true

       ConcretePrototype cp4 = (ConcretePrototype) cp1.deepClone();
       System.out.println(cp1.getName() == cp4.getName()); //false
   }

}
