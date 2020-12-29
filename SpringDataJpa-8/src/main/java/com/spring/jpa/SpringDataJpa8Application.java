package com.spring.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.spring.jpa.Entity.ContactEntity;
import com.spring.jpa.Repo.ContactMasterRepo;

@SpringBootApplication
public class SpringDataJpa8Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntx = SpringApplication.run(SpringDataJpa8Application.class, args);
		ContactMasterRepo bean = cntx.getBean(ContactMasterRepo.class);
		/*
		 * ContactEntity contactEntity=new ContactEntity();
		 * contactEntity.setContactname("satheesh");
		 * contactEntity.setContactNumber("745750883"); ContactEntity save =
		 * bean.save(contactEntity); System.err.println("-----------------"+save);
		 */

		int pageNo = 3;
		int pageSize = 3;
//		Sort descending = Sort.by("contactNo").descending();
//		Sort descending1 = Sort.by("contactNumber").descending();
//		Sort combine=descending.and(descending1);
//		PageRequest pageRequest=PageRequest.of(pageNo,pageSize,combine);
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<ContactEntity> pageData = bean.findAll(pageRequest);
		int totalPages = pageData.getTotalPages();
		System.out.println("--------***-----" + totalPages);
		if (pageData.hasContent()) {
			List<ContactEntity> content = pageData.getContent();
			content.forEach(x -> {
				System.err.println("Pagination and Sorting : " + x);
			});
		} else {
			List<ContactEntity> contactEntities = new ArrayList<ContactEntity>();
			contactEntities.forEach(x -> {
				System.out.println("--------***-----" + x);
			});
		}

		cntx.close();

	}

}
