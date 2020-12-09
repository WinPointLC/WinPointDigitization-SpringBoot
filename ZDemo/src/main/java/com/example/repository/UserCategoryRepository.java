package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UserCategory;

@Repository
public interface UserCategoryRepository extends JpaRepository<UserCategory, Integer> {

	
	
}
