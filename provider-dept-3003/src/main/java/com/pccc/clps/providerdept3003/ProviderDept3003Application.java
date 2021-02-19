package com.pccc.clps.providerdept3003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.pccc.clps.providerdept3003.dao")
public class ProviderDept3003Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept3003Application.class, args);
    }

}
