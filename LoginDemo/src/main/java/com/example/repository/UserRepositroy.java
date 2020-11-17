package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UserTab;

@Repository
public interface UserRepositroy extends CrudRepository<UserTab, Integer>{

	UserTab findByUsername(String username);
	
}
