package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Address;

@Repository
public interface addressRepository extends JpaRepository<Address, Integer> {

	public default void addEnquiryDetails(Address address) {
		save(address);
	}


}

