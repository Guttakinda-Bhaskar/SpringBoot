package com.spring.jpa.Repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.jpa.Entity.ContactEntity;

public interface ContactMasterRepo extends PagingAndSortingRepository<ContactEntity, Integer>{
	

}
