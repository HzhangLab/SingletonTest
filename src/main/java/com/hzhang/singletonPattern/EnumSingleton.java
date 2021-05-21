package com.hzhang.singletonPattern;

import org.springframework.web.client.RestTemplate;

public enum EnumSingleton {
    SINGLETON;


    private RestTemplate restTemplate;

    private EnumSingleton(){
       restTemplate = new RestTemplate();
    }

    public RestTemplate getInstance(){
        return restTemplate;
    }
}
