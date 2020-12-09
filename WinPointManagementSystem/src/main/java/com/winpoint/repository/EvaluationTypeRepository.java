package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.EvaluationType;

@Repository
public interface EvaluationTypeRepository extends JpaRepository<EvaluationType, Integer>{

}
