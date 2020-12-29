package com.spring.jpa;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.jpa.Entities.ConatactMasterEntity;
import com.spring.jpa.Repo.ConatactMasterRepo;

@SpringBootApplication
public class SpringDataJpa6Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpa6Application.class, args);
		ConatactMasterRepo bean = run.getBean(ConatactMasterRepo.class);
		/*
		 * 
		 * Iterable<ConatactMasterEntity> findAllById =
		 * bean.findAllById(Arrays.asList(2,3,4,5,6,7,8,9)); findAllById.forEach(entity
		 * ->{
		 * 
		 * System.err.println("SpringDataJpa6Application.main()"+entity);
		 * 
		 * });
		 */

		/*
		 * Optional<ConatactMasterEntity> findById = bean.findById(1);
		 * if(findById.isPresent()) { ConatactMasterEntity conatactMasterEntity =
		 * findById.get();
		 * System.err.println("SpringDataJpa6Application.conatactMasterEntity()"+
		 * conatactMasterEntity);
		 * 
		 * }
		 */
	List<ConatactMasterEntity> findByBusinessName = bean.findByBusinessName("bhaskar");
	System.err.println("SpringDataJpa6Application.conatactMasterEntity()"+findByBusinessName);
	

	}

}
