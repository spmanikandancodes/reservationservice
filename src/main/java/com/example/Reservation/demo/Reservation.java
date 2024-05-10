package com.example.Reservation.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Reservation {

	public static void main(String[] args) {
		SpringApplication.run(Reservation.class, args);
	}

}
