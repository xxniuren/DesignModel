package com.qiyi.bridgeModel;

/**
 * Created by yushuang on 2017/9/9.
 */
public abstract class Bridge {
    private Sourceable sourceable;
    //get method
    public Sourceable getSourceable(){
        return sourceable;
    }
    //set method
    public void setSourceable(Sourceable sourceable){
        this.sourceable = sourceable;
    }
    public void method(){
        sourceable.method();
    }
}
