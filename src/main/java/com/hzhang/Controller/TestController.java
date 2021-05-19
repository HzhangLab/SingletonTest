package com.hzhang.Controller;

import com.alibaba.nacos.api.config.annotation.NacosProperty;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController()
@RequestMapping("test")
public class TestController {

    @NacosValue(value = "${test.value}", autoRefreshed = true)
    private String value= "MM";

    @PostMapping("get")
    private String testGet(){
        return this.value;
    }


}
