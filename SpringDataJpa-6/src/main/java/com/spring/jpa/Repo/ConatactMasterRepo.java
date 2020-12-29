package com.spring.jpa.Repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.Entities.ConatactMasterEntity;
@Repository
public interface ConatactMasterRepo extends JpaRepository<ConatactMasterEntity, Serializable> {
	
	List<ConatactMasterEntity> findByBusinessName(String name);
	}