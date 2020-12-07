package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.DifficultyLevel;

public interface DifficultyLevelRepository extends JpaRepository<DifficultyLevel, Integer>{

}
