package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.SegmentType;

@Repository
public interface SegmentTypeRepository extends JpaRepository<SegmentType, Integer> {

}
