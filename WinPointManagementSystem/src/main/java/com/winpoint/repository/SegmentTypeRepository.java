package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.SegmentType;

@Repository
public interface SegmentTypeRepository extends JpaRepository<SegmentType, Integer> {

}
