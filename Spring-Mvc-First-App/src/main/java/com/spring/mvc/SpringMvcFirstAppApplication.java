package com.spring.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.mvc.Repo.BusProviderRepo;

@SpringBootApplication
public class SpringMvcFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringMvcFirstAppApplication.class, args);
//		BusProviderRepo bean = run.getBean(BusProviderRepo.class);
//		long count = bean.count();
//		System.err.println("-------------->>>"+count);
	}

}
