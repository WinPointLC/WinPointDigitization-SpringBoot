package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.EvaluationType;

@Repository
public interface EvaluationTypeRepository extends JpaRepository<EvaluationType, Integer>{

}
