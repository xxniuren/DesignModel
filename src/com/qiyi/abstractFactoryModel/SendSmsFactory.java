package com.qiyi.abstractFactoryModel;

/**
 * Created by yushuang on 2017/9/4.
 */
public class SendSmsFactory implements provider{
    public Sender produce(){
        return new SmsSender();
    }
}
