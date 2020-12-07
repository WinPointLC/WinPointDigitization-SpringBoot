package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.RevenueType;

@Repository
public interface RevenueTypeRepository extends JpaRepository<RevenueType, Integer> {

}
