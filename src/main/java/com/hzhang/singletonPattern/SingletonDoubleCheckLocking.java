package com.hzhang.singletonPattern;

public class SingletonDoubleCheckLocking {

    private static volatile SingletonDoubleCheckLocking singletonDoubleCheckLocking;

    private SingletonDoubleCheckLocking(){};

    public static SingletonDoubleCheckLocking getInstance(){
       if (singletonDoubleCheckLocking == null){
           synchronized (SingletonDoubleCheckLocking.class){
               if (singletonDoubleCheckLocking == null){
                   singletonDoubleCheckLocking = new SingletonDoubleCheckLocking();
               }
           }
       }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singletonDoubleCheckLocking;
    }
}
