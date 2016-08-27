package com.create.builderPattern;

/**
 * Builder --接口，规范产品对象各个组成部分的构建
 *
 * Created by Administrator on 2016/8/27 0027.
 */
public interface PersonBuilder {

    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();

}
