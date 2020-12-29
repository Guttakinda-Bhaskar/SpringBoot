package com.spring.jpa;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.jpa.Entity.OnpassiveEntity;
import com.spring.jpa.repo.OnpassiveRepo;

@SpringBootApplication
public class SpringDataJpa9Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpa9Application.class, args);
		OnpassiveRepo bean = run.getBean(OnpassiveRepo.class);
		OnpassiveEntity onpassiveEntity=new OnpassiveEntity();
		onpassiveEntity.setEmpname("Guttakindafhg");
		onpassiveEntity.setDesignation("JavaDevel");
		onpassiveEntity.setJoinDate(new Date());
		OnpassiveEntity save = bean.save(onpassiveEntity);
		System.err.println("---------onpassive entity ::::: "+save);
		
		run.close();
		
	}

}
