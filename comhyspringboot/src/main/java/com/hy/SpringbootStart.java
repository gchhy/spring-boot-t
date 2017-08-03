package com.hy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2017/7/27 0027.
 */
@ComponentScan(basePackages = "com.hy")
@SpringBootApplication
@EnableEurekaClient
public class SpringbootStart {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootStart.class);
        app.run(args);
    }
}
