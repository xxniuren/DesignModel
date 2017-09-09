package com.qiyi.factoryModel;

/**
 * Created by yushuang on 2017/9/1.
 */
public class testFactory {
    public static void main(String[] args){
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("SmsSender");
        sender.sender();
    }
}


