package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.EmployeeCategory;

@Repository
public interface EmployeeCategoryRepository extends JpaRepository<EmployeeCategory, Integer>{

}
