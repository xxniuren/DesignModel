package com.qiyi.factoryModel;

/**
 * Created by yushuang on 2017/9/4.
 */
public class SendFactoryStatic {
    public static Sender smsSender(){
        return new SmsSender();
    }
    public static Sender mailSender(){
        return new MailSender();
    }
}
