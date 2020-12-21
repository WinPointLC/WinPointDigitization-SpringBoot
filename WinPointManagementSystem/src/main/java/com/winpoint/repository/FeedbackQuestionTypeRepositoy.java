package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.FeedbackQuestionType;

@Repository
public interface FeedbackQuestionTypeRepositoy extends JpaRepository<FeedbackQuestionType, Integer>{
//	FeedbackQuestionType findByFeedbackQuestionType(String FeedbackQuestionTypeName);
}
