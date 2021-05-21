package com.hzhang.singletonPattern;

public class SingletonLazy {


    private static SingletonLazy singletonLazy;

    private SingletonLazy(){
    }

    private static SingletonLazy instance(){
        return new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        if (singletonLazy == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singletonLazy = instance();
        }
        return singletonLazy;
    }
}
