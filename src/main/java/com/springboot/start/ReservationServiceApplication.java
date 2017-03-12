package com.springboot.start;

import com.springboot.mode.Reservation;
import com.springboot.service.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages="com")
public class ReservationServiceApplication {

	@Bean
	CommandLineRunner runner (ReservationRepository rr) {
		return args -> {
			Arrays.asList("School","Student","doctor","lawyer","teacher").stream().forEach(s -> rr.save(new Reservation(s)));
			rr.findAll().forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}
}
