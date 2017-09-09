package com.qiyi.factoryModel;

/**
 * Created by yushuang on 2017/9/4.
 * 该种工厂模式只是用多个方法代替字符串，本质上一样
 */
public class SendFactoryByMethod {
    public Sender produceMailSender(){
        return new MailSender();
    }
    public Sender produceSmsSender(){
        return new SmsSender();
    }
}
