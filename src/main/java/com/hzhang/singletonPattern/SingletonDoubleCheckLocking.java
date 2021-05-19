package com.hzhang.singletonPattern;

public class SingletonDoubleCheckLocking {

    private static SingletonDoubleCheckLocking singletonDoubleCheckLocking;

    private SingletonDoubleCheckLocking(){};

    public static SingletonDoubleCheckLocking getInstance(){
       if (singletonDoubleCheckLocking == null){
           synchronized ("10"){
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
