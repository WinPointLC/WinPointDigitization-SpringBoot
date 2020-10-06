package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.UserProfile;
import com.example.repository.UserProfileRepository;


@Service
public class UserProfileService {
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	public List<UserProfile> getAllUserProfile() {
		ArrayList<UserProfile> userProfileList = new ArrayList<>();
		userProfileRepository.findAll().forEach(userProfileList::add);		//stream API  (lamba exp , stream api)
		return userProfileList;
	}

	public void addUserProfile(UserProfile userProfile) {
		System.out.println("reached here \n"+userProfile.getEmail()+" "+userProfile.getPassword());
		userProfileRepository.save(userProfile);
	}
	
	
	public void deleteUserProfile(UserProfile userProfile) {
		userProfileRepository.delete(userProfile);
	}

}
