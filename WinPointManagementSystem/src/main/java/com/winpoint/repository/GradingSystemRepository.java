package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.GradingSystem;

@Repository
public interface GradingSystemRepository extends JpaRepository<GradingSystem, String>{

}
