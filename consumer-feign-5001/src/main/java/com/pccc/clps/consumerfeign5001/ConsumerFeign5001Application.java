package com.pccc.clps.consumerfeign5001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.pccc.clps")
public class ConsumerFeign5001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign5001Application.class, args);
    }

}
