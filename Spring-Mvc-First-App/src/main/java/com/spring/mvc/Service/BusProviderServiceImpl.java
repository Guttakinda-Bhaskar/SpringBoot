package com.spring.mvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.Repo.BusProviderRepo;
import com.spring.mvc.entities.BusProviders;
@Service
public class BusProviderServiceImpl implements BusProviderService{
@Autowired
public BusProviderRepo busProviderRepo;

@Override
public boolean save(BusProviders bus) {
	BusProviders save = busProviderRepo.save(bus);
	return save != null;
}

}
