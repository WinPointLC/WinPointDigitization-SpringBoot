package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.SecurityQuestions;

@Repository
public interface SecurityQuestionsRepository extends JpaRepository<SecurityQuestions, Integer>{

}
