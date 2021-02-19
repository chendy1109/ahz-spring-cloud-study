package com.pccc.clps.consumerdept4001.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringCloudConfig {

    @LoadBalanced //引入ribbon负载均衡
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 随机算法的负载均衡
     * @return
     */
    @Bean
    public IRule TulingRule() {
        //return new RandomRule();
        return new RetryRule();
    }
}
