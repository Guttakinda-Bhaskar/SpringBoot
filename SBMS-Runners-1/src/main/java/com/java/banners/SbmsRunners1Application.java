package com.java.banners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.banners.runners.Student;

@SpringBootApplication
public class SbmsRunners1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbmsRunners1Application.class, args);
		Student bean = run.getBean("student",Student.class);
		System.out.println("SbmsRunners1Application.main()"+bean);
	}

}
