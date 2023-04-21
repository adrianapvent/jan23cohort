package com.codingdojo.loginreg.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.loginreg.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
	
//	Model gets imported here	
    List<User> findAll();
    
    Optional<User> findByEmail(String email);

}
