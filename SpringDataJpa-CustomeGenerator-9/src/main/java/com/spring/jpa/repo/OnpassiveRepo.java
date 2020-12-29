package com.spring.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.Entity.OnpassiveEntity;

public interface OnpassiveRepo extends CrudRepository<OnpassiveEntity, String>{

}
