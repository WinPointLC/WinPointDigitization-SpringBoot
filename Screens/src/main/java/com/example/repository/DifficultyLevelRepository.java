package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.DifficultyLevel;

@Repository
public interface DifficultyLevelRepository extends JpaRepository<DifficultyLevel, Integer>{

}
