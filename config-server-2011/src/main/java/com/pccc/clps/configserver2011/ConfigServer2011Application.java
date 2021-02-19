package com.pccc.clps.configserver2011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer2011Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer2011Application.class, args);
    }

}
