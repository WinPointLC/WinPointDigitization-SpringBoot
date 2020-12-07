package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.FeedbackQuestionType;

@Repository
public interface FeedbackQuestionTypeRepositoy extends JpaRepository<FeedbackQuestionType, Integer>{
	

}
