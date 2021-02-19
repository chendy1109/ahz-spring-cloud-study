package com.pccc.clps.providerdept3001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.pccc.clps.providerdept3001.dao")
public class ProviderDept3001Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept3001Application.class, args);
    }

}
