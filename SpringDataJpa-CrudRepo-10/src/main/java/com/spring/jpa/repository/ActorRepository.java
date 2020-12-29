package com.spring.jpa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.Entity.ActorEntity;

@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, Serializable>{
	@Query("select actorId,firstname,lastname,lastUpdate from ActorEntity where actorId=:id")
public ActorEntity ActorData(int id);
}