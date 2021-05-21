package com.hzhang.singletonPattern;

public class SingletonStaticClass {

    private SingletonStaticClass(){};

    private static class InstantSingleton{
        private static SingletonStaticClass singletonStaticClass = new SingletonStaticClass();
    }

    public static SingletonStaticClass getInstance(){
        return InstantSingleton.singletonStaticClass;
    }

}
