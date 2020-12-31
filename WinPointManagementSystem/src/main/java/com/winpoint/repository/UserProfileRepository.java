package com.winpoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winpoint.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer>{
	
	List<UserProfile> findByEmailId(String emailId);
	
}
