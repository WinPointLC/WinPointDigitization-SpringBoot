package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserRepositroy extends CrudRepository<User, Integer>{

	User findByUsername(String username);
	
}
