package com.qiyi.abstractFactoryModel;

/**
 * Created by yushuang on 2017/9/4.
 */
public class MailSender implements Sender{
    public void sender(){
        System.out.println("mail sender");
    }
}
