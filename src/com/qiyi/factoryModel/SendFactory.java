package com.qiyi.factoryModel;

/**
 * Created by yushuang on 2017/9/1.
 * 工厂模式只是在工厂中new出对象的实例，然后调用工厂对象，直接引用对象的实例
 */
public class SendFactory {
    public Sender produce(String type){
        Sender sender;
        if("SmsSender".equals(type)){
            sender = new SmsSender();
        }else {
            sender = new MailSender();
        }
        return sender;
    }
}
