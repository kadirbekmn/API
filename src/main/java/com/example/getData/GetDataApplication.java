package com.example.getData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GetDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetDataApplication.class, args);
	}

}
