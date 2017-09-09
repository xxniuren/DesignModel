package com.qiyi.singleModel;

/**
 * Created by yushuang on 2017/9/5.
 * 用懒汉子形式的单例模式来生成一个不可变对象
 */
public class singleModel1 {
    private singleModel1() {
    }

    private static volatile singleModel1 instance = null;

    public static singleModel1 getInstance() {
        if (null == instance) {
            synchronized (singleModel1.class) {
                if (null == instance) {
                    instance = new singleModel1();
                }
            }
        }
        return instance;
    }
}
