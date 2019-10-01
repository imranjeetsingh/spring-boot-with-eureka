package com.example.NewHotelCatalouge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NewHotelCatalougeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewHotelCatalougeApplication.class, args);
	}

}
