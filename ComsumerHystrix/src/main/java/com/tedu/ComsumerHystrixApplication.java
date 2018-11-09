package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class ComsumerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComsumerHystrixApplication.class, args);
	}
}
