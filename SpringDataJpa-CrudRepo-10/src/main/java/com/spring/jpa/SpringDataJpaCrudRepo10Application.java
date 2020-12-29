package com.spring.jpa;

import java.io.Serializable;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.jpa.Entity.ActorEntity;
import com.spring.jpa.repository.ActorRepository;

@SpringBootApplication
public class SpringDataJpaCrudRepo10Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaCrudRepo10Application.class, args);
		ActorRepository bean = context.getBean(ActorRepository.class);

		long count = bean.count();
		System.err.println("SpringDataJpaCrudRepo10Application.count()" + count);
		boolean existsById = bean.existsById(1);
		if (existsById = true) {
			System.err.println("SpringDataJpaCrudRepo10Application.existsById()" + existsById);
		}
		Iterable<ActorEntity> findAll = bean.findAll();
		findAll.forEach(x -> {
			System.err.println("------findAll----" + x);
		});
		Iterable<ActorEntity> findAllById = bean.findAllById(null);
		findAllById.forEach(x -> {
			System.err.println("-----findAllById------" + findAllById);
		});
		

		//bean.deleteById(200);

		//bean.deleteById((Serializable) Arrays.asList(199, 198, 197));

		ActorEntity actorData = bean.ActorData(1);

		System.err.println("--------" + actorData);
		System.err.println("--------" + actorData.getFirstname());
		System.err.println("--------" + actorData.getLastname());
		System.err.println("--------" + actorData.getLastUpdate());
//bean.findAll(pageable)
	}

}