package com.create.builderPattern;

/**
 * 调用具体建造者来创建复杂对象的各部分，不涉及具体产品信息；
 * 只负责产品的各部分完整创建和按顺序创建；
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }

}
