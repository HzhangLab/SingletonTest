package com.hzhang.singletonPattern;

public class SingletonLazySafety {

    private static SingletonLazySafety singletonLazySafety;

    private SingletonLazySafety(){};

    public static synchronized SingletonLazySafety getInstance(){
        try {
            if (singletonLazySafety == null){
                singletonLazySafety = new SingletonLazySafety();
            }
            Thread.sleep(3000);
        } catch (Exception exception){
            System.out.println(exception);
        }
        return singletonLazySafety;
    }
}
