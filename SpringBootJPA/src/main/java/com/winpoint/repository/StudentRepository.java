package com.winpoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.winpoint.model.Student;

public interface StudentRepository extends CrudRepository<Student, String>{

}
