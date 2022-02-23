package com.lxf.springcloudalibabasentinel9005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudAlibabaSentinel9004Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaSentinel9004Application.class, args);
    }

}
