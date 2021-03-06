package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.TimeSlots;

@Repository
public interface TimeSlotsRepository extends JpaRepository<TimeSlots, Integer>{

}
