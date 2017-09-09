package com.qiyi.protoType;

/**
 * Created by yushuang on 2017/9/6.
 * 原型模式，该模式的设计思想是将一个对象作为原型，对其进行复制、克隆、产生一个和原型对象类似的新对象
 */
public class protoType implements Cloneable{
    public Object getInstance(protoType protoOld) throws CloneNotSupportedException{
        protoType protoNew =  (protoType) protoOld.clone();
        return protoNew;
    }
}
