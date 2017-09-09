package com.qiyi.buildModel;

import com.qiyi.factoryModel.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yushuang on 2017/9/6.
 */
public class builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }
    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }


}
