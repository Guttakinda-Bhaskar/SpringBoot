package com.spring.mvc.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entities.BusProviders;

@Repository
public interface BusProviderRepo extends JpaRepository<BusProviders, Serializable> {

}
