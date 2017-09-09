package com.qiyi.DecoratorModel;

/**
 * Created by yushuang on 2017/9/8.
 */
public class Decorator implements Sourceable{

    private Sourceable sourceable;
    public Decorator(Sourceable sourceable){
        super();
        this.sourceable = sourceable;
    }

    public void method(){
        System.out.println("before Decorator");
        sourceable.method();
        System.out.println("after Decorator");
    }

    public static void main(String args[]){
        Decorator decorator = new Decorator(new Source());
        decorator.method();
    }

}
