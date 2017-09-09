package com.qiyi.factoryModel;

import javax.net.ssl.SNIHostName;

/**
 * Created by yushuang on 2017/9/4.
 */
public class testStaticFactory {
    public static void main(String args[]){
        Sender sender = SendFactoryStatic.mailSender();
        sender.sender();
    }
}
