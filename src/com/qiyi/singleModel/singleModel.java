package com.qiyi.singleModel;

/**
 * Created by yushuang on 2017/9/5.
 * 饿汉子模式，初始化时，先生成一个实例对象，该过程线程安全，private是控制访问权限，static是内存中，防止多次实例化。final是常量？？  不太明白final的意思。。。。
 */
public class singleModel {
    private singleModel(){}
    private static final singleModel single = new singleModel();
    public static singleModel getInstance(){
        return single;
    }
}
