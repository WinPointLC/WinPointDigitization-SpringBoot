package com.winpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winpoint.model.Student;
import com.winpoint.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents()  
	{    
		List<Student>students = new ArrayList<>();    
		studentRepository.findAll().forEach(students::add);    
		return students;    
	}    
	public void addStudent(Student student)  
	{    
		studentRepository.save(student);    
	}    
}
