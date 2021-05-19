package com.hzhang.singletonPattern;

import org.springframework.web.client.RestTemplate;

public class SingletonTest {

    public static void main(String[] args) {
//        RestTemplate restTemplate1 = EnumSingleton.SINGLETON.getInstance();
//        System.out.println(restTemplate1.toString());
//        RestTemplate restTemplate2 = EnumSingleton.SINGLETON.getInstance();
//        System.out.println(restTemplate2.toString());

//        for (int i=0; i< 100; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    RestTemplate restTemplate1 = EnumSingleton.SINGLETON.getInstance();
//                    System.out.println(restTemplate1.toString());
//                }
//            };
//        }
//
//        for (int i=0; i< 100; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                        SingletonLazy singletonLazy = SingletonLazy.getInstance();
//                        System.out.println(singletonLazy.toString());
//                }
//            }.start();
//        }

//        /**
//         * 优点：线程安全
//         * 缺点：加锁粒度大，对整个方法加锁
//         */
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
         *
         */
        for (int i=0; i< 100; i++){
            new Thread(){
                @Override
                public void run() {
                    SingletonDoubleCheckLocking singletonDoubleCheckLocking = SingletonDoubleCheckLocking.getInstance();
                    System.out.println(singletonDoubleCheckLocking.toString());
                }
            }.start();
        }


//        for (int i=0; i< 100; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    SingletonHangry hangry = SingletonHangry.getInstance();
//                    System.out.println(hangry.toString());
//                }
//            }.start();
//        }

    }

}
