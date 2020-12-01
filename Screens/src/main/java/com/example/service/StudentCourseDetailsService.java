package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.StudentCourseDetails;
import com.example.model.UserDetails;
import com.example.repository.StudentCourseDetailsRepository;
import com.example.repository.UserDetailsRepository;

@Service
public class StudentCourseDetailsService {
	@Autowired StudentCourseDetailsRepository studentCourseDetailsRepository;
	@Autowired UserDetailsRepository userDetailsRepository;
	
	
	public List<UserDetails>  userList(Integer batchId){
		System.out.println("Here i AM\n\n\n\n ");
		List<UserDetails>users = new ArrayList<>();
		for(StudentCourseDetails a : studentCourseDetailsRepository.findByBatchId(batchId)){
			users.add(userDetailsRepository.findByUserId(a.getUserId()));
			System.out.println(userDetailsRepository.findByUserId(a.getUserId()));
		}
		return users;
	}
}
