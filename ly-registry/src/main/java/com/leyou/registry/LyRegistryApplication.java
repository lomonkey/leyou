package com.leyou.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description       ：Eureka 启动类
 *
 * @author ：lvhan
 * @version ：1.0
 * @date ：2019/11/22 16:34
 */
@SpringBootApplication
@EnableEurekaServer
public class LyRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyRegistryApplication.class);
    }
}
