package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.FeedbackCategory;

@Repository
public interface FeebackCategoryRepository extends JpaRepository<FeedbackCategory, Integer>{

}
