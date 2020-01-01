package org.sid.service_compte;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients("org.sid.service_compte")
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceCompteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCompteApplication.class, args);
	}

}
