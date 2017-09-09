package com.qiyi.FlyWeightModel;

import java.util.Vector;

/**
 * Created by yushuang on 2017/9/9.
 * 最好的例子就是连接池
 */
public class connectPool {
    private Vector<connectPool> connectPools = new Vector<connectPool>();

    //公有属性
    public connectPool() {
        //增加一些元素
    }

    //用了的元素返回连接池，释放资源
    public synchronized void release(connectPool connectPool) {
        connectPools.add(connectPool);
    }

    //获取元素 这样做的逻辑貌似有问题，如果没有element的话  应该是新建一个element 。
    public synchronized connectPool getElement() {
        if (connectPools.size() > 0) {
            connectPool conn = connectPools.get(0);
            connectPools.remove(conn);
            return conn;
        } else {
            return null;
        }
    }
}
