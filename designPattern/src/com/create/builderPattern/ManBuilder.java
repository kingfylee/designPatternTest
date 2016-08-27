package com.create.builderPattern;

/**
 * 实现 Builder ，具体化对象的各部分创建，并返回实例；
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class ManBuilder implements PersonBuilder {

    private Person person;

    public ManBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("Man`s head;");
    }

    @Override
    public void buildBody() {
        person.setBody("Man`s body;");
    }

    @Override
    public void buildFoot() {
        person.setFoot("Man`s foot;");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
