package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Streams;

@Repository
public interface StreamsRepository extends JpaRepository<Streams, Integer>{
	
}

//public class StreamsRepository{}
