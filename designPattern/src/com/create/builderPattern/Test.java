package com.create.builderPattern;

/**
 * Created by Administrator on 2016/8/27 0027.
 */
public class Test {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        ManBuilder mb = new ManBuilder();
        Person person = pd.constructPerson(mb);
    }
}
