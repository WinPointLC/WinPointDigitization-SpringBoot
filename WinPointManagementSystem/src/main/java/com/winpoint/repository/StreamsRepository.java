package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.Streams;

@Repository
public interface StreamsRepository extends JpaRepository<Streams, Integer>{
	
}

//public class StreamsRepository{}
