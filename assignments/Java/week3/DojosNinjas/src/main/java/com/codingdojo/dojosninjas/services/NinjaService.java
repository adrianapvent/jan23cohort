package com.codingdojo.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosninjas.models.Ninja;
import com.codingdojo.dojosninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepo repo;
	
	//return all ninjas 
	public List<Ninja> allNinjas() {
		return repo.findAll();
	}
	
	//creates a ninja
	public Ninja createNinja(Ninja e) {
		return repo.save(e);
	} 
	
	//fins a ninja
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = repo.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}
		return null;
	}

}
