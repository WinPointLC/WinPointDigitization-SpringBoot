package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UserProfile;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, String> {

}
