package com.qiyi.adaptModel;

import javax.annotation.processing.SupportedSourceVersion;

/**
 * Created by yushuang on 2017/9/7.
 */
public class objectAdapt implements method {

    private method_1 method_1 = new method_1();

    public objectAdapt(method_1 method_1) {
        super();
        this.method_1 = method_1;
    }

    public void showMethod1() {
        this.method_1.showMethod1();
    }

    public void showMethod2() {
        System.out.println("show method2");

    }

    public static void main(String args[]){
        method_1 method_1 = new method_1();
        objectAdapt objectAdapt = new objectAdapt(method_1);

        objectAdapt.showMethod1();
    }

}
