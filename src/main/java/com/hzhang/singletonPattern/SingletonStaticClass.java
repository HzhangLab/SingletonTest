package com.hzhang.singletonPattern;

public class SingletonStaticClass {

    private SingletonStaticClass(){};

    private static class InstantSingleton{

        static SingletonStaticClass instance(){
            return new SingletonStaticClass();
        }
    }

    public static SingletonStaticClass getInstance(){
        return InstantSingleton.instance();
    }

}
