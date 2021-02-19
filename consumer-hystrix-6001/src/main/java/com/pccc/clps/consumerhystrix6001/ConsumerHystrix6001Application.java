package com.pccc.clps.consumerhystrix6001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.pccc.clps")
@EnableCircuitBreaker
public class ConsumerHystrix6001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrix6001Application.class, args);
    }

}
