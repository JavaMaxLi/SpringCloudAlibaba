package com.lxf.springcloudalibabanacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudAlibabaNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaNacosApplication.class, args);
    }

}
