package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.UserProfile;

public interface UserProfileRepository extends CrudRepository<UserProfile, String> {

}
