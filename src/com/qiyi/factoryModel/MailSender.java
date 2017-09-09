package com.qiyi.factoryModel;

/**
 * Created by yushuang on 2017/9/1.
 */
public class MailSender implements Sender{
    @Override
    public void sender(){
        System.out.println("mail sender");
    }
}
