package com.example.getData;

import com.example.getData.model.Data;
import com.example.getData.repository.GetRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Repository;
@SpringBootApplication
@EnableCaching
public class GetDataApplication{
	public static void main(String[] args) {
		SpringApplication.run(GetDataApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Data data;
//
//		for(long i = 1; i < 1000; i++){
//			data = new Data(i,"pxm_price" + i);
//			repository.save(data);
//		}
//	}
}