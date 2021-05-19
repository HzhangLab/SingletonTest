package com.hzhang.singletonPattern;

public class SingletonHangry {

    private static SingletonHangry singletonHangry = new SingletonHangry();

    private SingletonHangry(){};

    public static SingletonHangry getInstance(){
        return singletonHangry;
    }

}
