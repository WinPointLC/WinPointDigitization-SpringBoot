package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winpoint.model.Course;
import com.winpoint.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer>{

}
