package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description       ：ItemService Application 启动类
 *
 * @author ：lvhan
 * @version ：1.0
 * @date ：2019/11/22 21:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ItemService {
    public static void main(String[] args) {
        SpringApplication.run(ItemService.class);
    }
}
