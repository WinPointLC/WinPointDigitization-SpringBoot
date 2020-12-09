package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.UserCategory;

@Repository
public interface UserCategoryRepository extends JpaRepository<UserCategory, Integer> {

	
	
}
