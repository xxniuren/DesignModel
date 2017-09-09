package com.qiyi.abstractFactoryModel;

/**
 * Created by yushuang on 2017/9/4.
 */
public class SmsSender implements Sender{
    public void sender(){
        System.out.println("sms sender");
    }
}
