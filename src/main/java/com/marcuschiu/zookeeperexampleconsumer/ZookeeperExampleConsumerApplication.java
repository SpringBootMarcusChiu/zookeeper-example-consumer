package com.marcuschiu.zookeeperexampleconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // enable use of @FeignClient annotations
@EnableDiscoveryClient // make ZookeeperExampleConsumerApplication discovery-aware
@SpringBootApplication
public class ZookeeperExampleConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperExampleConsumerApplication.class, args);
	}

}
