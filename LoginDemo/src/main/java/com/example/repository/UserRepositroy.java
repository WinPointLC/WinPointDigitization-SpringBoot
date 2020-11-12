package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.User;

public interface UserRepositroy extends CrudRepository<User, Integer>{

	User findByUsername(String username);
	
}
