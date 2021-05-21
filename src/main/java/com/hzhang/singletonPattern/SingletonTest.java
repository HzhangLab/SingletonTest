package com.hzhang.singletonPattern;

import org.springframework.web.client.RestTemplate;

public class SingletonTest {

    public static void main(String[] args) {
        /**
         * 枚举 单例模式
         */
//        for (int i=0; i< 100; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    RestTemplate restTemplate = EnumSingleton.SINGLETON.getInstance();
//                    System.out.println(restTemplate.toString());
//                }
//            }.start();
//        }


        /**
         *  懒汉式-线程不安全 单例模式
         */
//        for (int i=0; i< 100; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                        SingletonLazy singletonLazy = SingletonLazy.getInstance();
//                        System.out.println(singletonLazy.toString());
//                }
//            }.start();
//        }

        /**
         *懒汉式-线程安全 单例模式
         * 优点：线程安全
         * 缺点：加锁粒度大，对整个方法加锁
         */
//        for (int i=0; i< 100; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    SingletonLazySafety singletonLazy = SingletonLazySafety.getInstance();
//                    System.out.println(singletonLazy.toString());
//                }
//            }.start();
//        }

        /**
         *double check locking 单例模式
         *
         */
//        for (int i=0; i< 100; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    SingletonDoubleCheckLocking singletonDoubleCheckLocking = SingletonDoubleCheckLocking.getInstance();
//                    System.out.println(singletonDoubleCheckLocking.toString());
//                }
//            }.start();
//        }


        /**
         * 饿汉式 单例模式
         */
//        for (int i=0; i< 100; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    SingletonHangry hangry = SingletonHangry.getInstance();
//                    System.out.println(hangry.toString());
//                }
//            }.start();
//        }

        /**
         * 静态内部类 单例模式
         */
        for (int i=0; i< 100; i++){
            new Thread(){
                @Override
                public void run() {
                    SingletonStaticClass singletonStaticClass =  SingletonStaticClass.getInstance();
                    System.out.println(singletonStaticClass.toString());
                }
            }.start();
        }

    }

}
